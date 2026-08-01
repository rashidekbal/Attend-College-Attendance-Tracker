package com.rtechnologies.attend_collegeattendancetracker.screens.onBoarding;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityOnboardingBinding;

public class OnboardingActivity extends AppCompatActivity {
    ActivityOnboardingBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOnboardingBinding.inflate(getLayoutInflater());

        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());


    }



}