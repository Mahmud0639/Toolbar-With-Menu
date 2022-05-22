package com.manuni.toolbarmenuweeklyassignments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.manuni.toolbarmenuweeklyassignments.databinding.ActivityDeveloperBinding;

public class DeveloperActivity extends AppCompatActivity {
    ActivityDeveloperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeveloperBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Developer");
    }
}