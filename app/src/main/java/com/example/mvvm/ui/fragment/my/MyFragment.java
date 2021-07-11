package com.example.mvvm.ui.fragment.my;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.libnavannotation.FragmentDestination;
import com.example.mvvm.R;
import com.example.mvvm.ui.AbsListFragment;

@FragmentDestination(pageUrl = "main/tabs/my", asStarter = true)
public class MyFragment extends AbsListFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);

        return root;
    }
}
