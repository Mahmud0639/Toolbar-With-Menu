package com.manuni.toolbarmenuweeklyassignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.manuni.toolbarmenuweeklyassignments.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {
    ActivityFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}