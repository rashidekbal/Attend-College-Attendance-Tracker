package com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.marks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentMarksBinding;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.HomeActivity;


public class MarksFragment extends Fragment {
    FragmentMarksBinding binding;
    HomeActivity activity;

    public MarksFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentMarksBinding.inflate(inflater,container,false);
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