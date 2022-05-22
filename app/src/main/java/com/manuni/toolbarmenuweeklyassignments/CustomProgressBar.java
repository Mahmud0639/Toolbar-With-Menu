package com.manuni.toolbarmenuweeklyassignments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;

import com.manuni.toolbarmenuweeklyassignments.databinding.ActivityCustomProgressBarBinding;

public class CustomProgressBar extends AppCompatActivity {
    ActivityCustomProgressBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    /*    if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }else {
            setTheme(R.style.Theme_Light);
        }*/

        super.onCreate(savedInstanceState);
        binding = ActivityCustomProgressBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}