package com.example.cropdetectionapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Disease1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease1);

        Button backbtn = findViewById(R.id.back);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the activity to navigate to upon button click
                Intent intent = new Intent(Disease1.this, Crops.class);
                startActivity(intent); // Start the new activity
            }
        });
    }
}