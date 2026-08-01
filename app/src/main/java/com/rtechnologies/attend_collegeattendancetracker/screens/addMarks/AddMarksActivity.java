package com.rtechnologies.attend_collegeattendancetracker.screens.addMarks;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityAddMarksBinding;

public class AddMarksActivity extends AppCompatActivity {
    ActivityAddMarksBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityAddMarksBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        setEventListeners();
    }
    private void setEventListeners(){
        binding.backBtn.setOnClickListener(v->finish());

    }
}