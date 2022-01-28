package com.example.mvvm.ui.fragment.find;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.libnavannotation.FragmentDestination;
import com.example.mvvm.R;
import com.example.mvvm.ui.AbsListFragment;
import com.example.mvvm.ui.fragment.sofa.SofaFragment;

@FragmentDestination(pageUrl = "main/tabs/find", asStarter = true)
public class FindFragment extends SofaFragment {

    @Override
    public void onAttachFragment(@NonNull Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }
}
