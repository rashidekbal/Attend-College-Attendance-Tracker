package com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.sidebar;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentSideBarBinding;
import com.rtechnologies.attend_collegeattendancetracker.screens.holiday.HolidayActivity;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.HomeActivity;
import com.rtechnologies.attend_collegeattendancetracker.screens.profile.ProfileActivity;
import com.rtechnologies.attend_collegeattendancetracker.screens.setting.SettingActivity;
import com.rtechnologies.attend_collegeattendancetracker.screens.timeTable.TimeTableActivity;


public class SideBarFragment extends Fragment {
FragmentSideBarBinding binding;
HomeActivity activity;

    public SideBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentSideBarBinding.inflate(inflater,container,false);
        init();
        setEventListeners();
        return binding.getRoot();
    }

    private void init() {
        activity=(HomeActivity) requireActivity();
    }

    private void setEventListeners(){
        binding.settingBtn.setOnClickListener(v-> {
            startActivity(new Intent(requireActivity(), SettingActivity.class));
            activity.closeDrawer();
        });
        binding.holidayBtn.setOnClickListener(v-> {
            startActivity(new Intent(requireActivity(), HolidayActivity.class));
            activity.closeDrawer();
        });
        binding.timeTableBtn.setOnClickListener(v-> {
            startActivity(new Intent(requireActivity(), TimeTableActivity.class));
            activity.closeDrawer();
        });
        binding.profileBtn.setOnClickListener(v-> {
            startActivity(new Intent(requireActivity(), ProfileActivity.class));
            activity.closeDrawer();
        });

    }
}