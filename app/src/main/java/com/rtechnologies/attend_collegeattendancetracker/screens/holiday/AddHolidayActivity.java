package com.rtechnologies.attend_collegeattendancetracker.screens.holiday;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rtechnologies.attend_collegeattendancetracker.R;
import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityAddHolidayBinding;
import com.rtechnologies.attend_collegeattendancetracker.databinding.ActivityHolidayBinding;

public class AddHolidayActivity extends AppCompatActivity {
    ActivityAddHolidayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityAddHolidayBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        setEventListeners();

    }
    private void setEventListeners(){
        binding.backBtn.setOnClickListener(v->finish());

    }
}