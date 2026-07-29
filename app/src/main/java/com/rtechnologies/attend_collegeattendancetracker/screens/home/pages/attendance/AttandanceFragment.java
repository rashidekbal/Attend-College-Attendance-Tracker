package com.rtechnologies.attend_collegeattendancetracker.screens.home.pages.attendance;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rtechnologies.attend_collegeattendancetracker.databinding.FragmentAttandanceBinding;


public class AttandanceFragment extends Fragment {
    FragmentAttandanceBinding binding;



    public AttandanceFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentAttandanceBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}