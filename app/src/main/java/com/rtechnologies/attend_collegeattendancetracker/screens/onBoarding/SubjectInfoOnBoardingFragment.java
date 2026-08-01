package com.rtechnologies.attend_collegeattendancetracker.screens.onBoarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentSubjectInfoOnBoardingBinding;
import com.rtechnologies.attend_collegeattendancetracker.screens.home.HomeActivity;


public class SubjectInfoOnBoardingFragment extends Fragment {
    FragmentSubjectInfoOnBoardingBinding binding;


    public SubjectInfoOnBoardingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentSubjectInfoOnBoardingBinding.inflate(inflater,container,false);
        setEventListeners();
        return binding.getRoot();
    }
    private void setEventListeners(){
        binding.backBtn.setOnClickListener(v->requireActivity().getOnBackPressedDispatcher().onBackPressed());
        binding.finishSetup.setOnClickListener(this::handleFinishSetup);
    }

    private void handleFinishSetup(View view) {
        startActivity(new Intent(requireActivity(), HomeActivity.class));
        requireActivity().finish();
    }
}