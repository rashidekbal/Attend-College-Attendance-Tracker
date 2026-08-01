package com.rtechnologies.attend_collegeattendancetracker.screens.subject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityAddSubjectBinding;

public class AddSubjectActivity extends AppCompatActivity {
    ActivityAddSubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityAddSubjectBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        setEventListeners();

    }

    private void setEventListeners() {
        binding.backBtn.setOnClickListener(v->finish());
    }
}