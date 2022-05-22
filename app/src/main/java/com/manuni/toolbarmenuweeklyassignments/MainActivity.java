package com.manuni.toolbarmenuweeklyassignments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.manuni.toolbarmenuweeklyassignments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      /*  if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }else {
            setTheme(R.style.Theme_Light);
        }*/
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Custom Toolbar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.refresh:
                Intent intent = new Intent(MainActivity.this,CustomProgressBar.class);
                startActivity(intent);
                break;
            case R.id.home:
                //Toast.makeText(this, "We are in Home Page now", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,FirstActivity.class));
                break;
            case R.id.portal:
                startActivity(new Intent(MainActivity.this,CheckBox.class));
                break;
            case R.id.theme:
                startActivity(new Intent(MainActivity.this,ThemeActivity.class));
                break;
            case R.id.share:
                //Toast.makeText(this, "Share is clicked", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Intent.ACTION_SEND);
                intent1.setType("text/plain");
                String subject = "Share this app";
                String body = "This is test app. We want to learn more from neat roots.";
                intent1.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent1.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(intent1,"Share With"));
                break;
           /* case R.id.rate:
                Toast.makeText(this, "Rate App is clicked", Toast.LENGTH_SHORT).show();
                break;*/
            case R.id.developer:
                //Toast.makeText(this, "Developer is clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,DeveloperActivity.class));
                break;
        }
        return true;
    }
}