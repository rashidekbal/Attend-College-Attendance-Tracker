package com.rtechnologies.attend_collegeattendancetracker.screens.onBoarding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentWelcomeBinding;


public class WelcomeFragment extends Fragment {
    FragmentWelcomeBinding binding;

    public WelcomeFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentWelcomeBinding.inflate(inflater,container,false);
        binding.nextBtn.setOnClickListener(this::handleNextBtnClick);
        return binding.getRoot();
    }

    private void handleNextBtnClick(View view) {
        Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_userInfoFragment);
    }

}