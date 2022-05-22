package com.manuni.toolbarmenuweeklyassignments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.manuni.toolbarmenuweeklyassignments.databinding.ActivityThemeBinding;

public class ThemeActivity extends AppCompatActivity {
    ActivityThemeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }else {
            setTheme(R.style.Theme_Light);
        }
        super.onCreate(savedInstanceState);
        binding = ActivityThemeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        binding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioBtnId = binding.radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(radioBtnId);
                // RadioButton radioButton1 = findViewById(binding.radioGroup.getCheckedRadioButtonId());


                if (radioBtnId == -1){
                    Toast.makeText(ThemeActivity.this, "Nothing was selected", Toast.LENGTH_SHORT).show();
                }else {
                    String radioTxt = radioButton.getText().toString();
                    if (binding.aSwitch.isChecked()){
                        binding.radioTxtId.setText("Night mode is on and you choose "+radioTxt);
                    }else {
                        binding.radioTxtId.setText("You choose "+radioTxt);
                    }
                }

            }
        });
    }
}