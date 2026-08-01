package com.rtechnologies.attend_collegeattendancetracker.screens.addAssignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityAddAssignmentBinding;

public class AddAssignmentActivity extends AppCompatActivity {
    ActivityAddAssignmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityAddAssignmentBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        setEventListeners();

    }

    private void setEventListeners() {
        binding.backBtn.setOnClickListener(v->finish());
    }
}