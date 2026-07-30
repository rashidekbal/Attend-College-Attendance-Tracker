package com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentHomeBinding;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.HomeActivity;
import com.rtechnologies.attend_collegeattendancetracker.screens.profile.ProfileActivity;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    HomeActivity activity;


    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(inflater,container,false);
        init();
        setEventListeners();
        return binding.getRoot();
    }

    private void setEventListeners() {
        binding.sideBarBtn.setOnClickListener(this::handleSideBarCLick);
        binding.profileBtn.setOnClickListener(v->{
            requireActivity().startActivity(new Intent(requireActivity(), ProfileActivity.class));
        });
    }

    private void handleSideBarCLick(View view) {
        if(activity!=null)activity.openDrawer();
    }

    private void init() {
        activity=(HomeActivity) requireActivity();

    }


}