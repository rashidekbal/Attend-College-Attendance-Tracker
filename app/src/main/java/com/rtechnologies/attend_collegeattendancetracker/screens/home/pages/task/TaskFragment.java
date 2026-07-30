package com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.task;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentTaskBinding;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.HomeActivity;

public class TaskFragment extends Fragment {
    FragmentTaskBinding binding;
    HomeActivity activity;


    public TaskFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentTaskBinding.inflate(inflater,container,false);
        init();
        setEventListeners();
        return binding.getRoot();
    }
    private void setEventListeners() {
        binding.sideBarBtn.setOnClickListener(this::handleSideBarCLick);
    }

    private void handleSideBarCLick(View view) {
        if(activity!=null)activity.openDrawer();
    }

    private void init() {
        activity=(HomeActivity) requireActivity();

    }
}