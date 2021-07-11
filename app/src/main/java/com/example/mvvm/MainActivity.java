package com.example.mvvm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.view.MenuItem;

import com.example.libcommon.utils.StatusBar;
import com.example.libnavannotation.ActivityDestination;
import com.example.mvvm.model.Destination;
import com.example.mvvm.utils.AppConfig;
import com.example.mvvm.utils.NavGraphBuilder;
import com.example.mvvm.view.AppBottomBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ActivityDestination(pageUrl = "main/tabs/main", needLogin = false)
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private AppBottomBar navView;
        NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        StatusBar.fitSystemBar(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = NavHostFragment.findNavController(fragment);
        NavGraphBuilder.build(this,navController,fragment.getId());
        navView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        HashMap<String, Destination> destConfig = AppConfig.getDestConfig();
        Iterator<Map.Entry<String, Destination>> iterator = destConfig.entrySet().iterator();
        //遍历 target destination 是否需要登录拦截
//        while (iterator.hasNext()) {
//            Map.Entry<String, Destination> entry = iterator.next();
//            Destination value = entry.getValue();
//            if (value != null && !UserManager.get().isLogin() && value.needLogin && value.id == menuItem.getItemId()) {
//                UserManager.get().login(this).observe(this, new Observer<User>() {
//                    @Override
//                    public void onChanged(User user) {
//                        navView.setSelectedItemId(menuItem.getItemId());
//                    }
//                });
//                return false;
//            }
//        }

        navController.navigate(menuItem.getItemId());
        return !TextUtils.isEmpty(menuItem.getTitle());
    }
}