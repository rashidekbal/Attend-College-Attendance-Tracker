package com.rtechnologies.attend_collegeattendancetracker.screens.onBoarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentAcademicInfoBinding;


public class AcademicInfoFragment extends Fragment {
    FragmentAcademicInfoBinding binding;



    public AcademicInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentAcademicInfoBinding.inflate(inflater,container,false);
        setEventListeners();
        return binding.getRoot();
    }
    private void setEventListeners() {
        binding.backBtn.setOnClickListener(v->requireActivity().getOnBackPressedDispatcher().onBackPressed());
        binding.continueBtn.setOnClickListener(this::handleContinueCLick);

    }

    private void handleContinueCLick(View view) {
        Navigation.findNavController(view).navigate(com.rtechnologies.attend_collegeattendancetracker.R.id.action_academicInfoFragment_to_subjectInfoOnBoardingFragment3);


    }
}