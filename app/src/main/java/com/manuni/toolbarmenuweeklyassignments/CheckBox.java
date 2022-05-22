package com.manuni.toolbarmenuweeklyassignments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.manuni.toolbarmenuweeklyassignments.databinding.ActivityCheckBoxBinding;

public class CheckBox extends AppCompatActivity {
    ActivityCheckBoxBinding binding;
    String spinnerItems;
    String values = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        setTitle("CheckBox and Spinner");

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* if (values.isEmpty()){
                    Toast.makeText(MainActivity.this, "Nothing is checked!", Toast.LENGTH_SHORT).show();
                }*/
                if (binding.banglaCB.isChecked()) {
                    values += "\nBangla";
                }
                if (binding.englishCB.isChecked()) {
                    values += "\nEnglish";
                }
                if (binding.socialCB.isChecked()) {
                    values += "\nSocial Science";
                }
                if (binding.generalCB.isChecked()) {
                    values += "\nGeneral Science";
                }

                if (values.isEmpty()){
                    Toast.makeText(CheckBox.this, "Nothing is selected!", Toast.LENGTH_SHORT).show();
                }else {
                    binding.showAllTxt.setText("You have selected "+values);
                }






            }

        });

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(CheckBox.this,R.array.spinner_value, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerId.setAdapter(spinnerAdapter);

        binding.spinnerId.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinnerItems = adapterView.getItemAtPosition(i).toString();
                if (spinnerItems.equals("-Select a category-")){
                    binding.doneId.setVisibility(View.GONE);
                }else {
                    binding.doneId.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        binding.doneId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinnerItems.equals("-Select a category-")){
                    Toast.makeText(CheckBox.this, "Nothing has selected", Toast.LENGTH_SHORT).show();
                }else {
                    //Toast.makeText(MainActivity.this, ""+spinnerItems, Toast.LENGTH_SHORT).show();
                    binding.doneId.setVisibility(View.GONE);

                    values +="\n"+spinnerItems;

                    binding.showAllTxt.setText("You have selected: "+values);
                }
            }
        });

    }
}