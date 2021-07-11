package com.example.mvvm.ui.fragment.publish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.libnavannotation.FragmentDestination;
import com.example.mvvm.R;
import com.example.mvvm.ui.AbsListFragment;

@FragmentDestination(pageUrl = "main/tabs/publish", asStarter = true)
public class PublishFragment extends AbsListFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);

        return root;
    }
}
