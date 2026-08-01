package com.rtechnologies.attend_collegeattendancetracker.screens.onBoarding;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentUserInfoBinding;


public class UserInfoFragment extends Fragment {
    FragmentUserInfoBinding binding;


    public UserInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUserInfoBinding.inflate(inflater, container, false);
        setEventListeners();
        return binding.getRoot();
    }

    private void setEventListeners() {
        binding.backBtn.setOnClickListener(v->requireActivity().getOnBackPressedDispatcher().onBackPressed());
        binding.continueBtn.setOnClickListener(this::handleContinueCLick);

    }

    private void handleContinueCLick(View view) {
        Navigation.findNavController(view).navigate(R.id.action_userInfoFragment_to_academicInfoFragment);

    }
}