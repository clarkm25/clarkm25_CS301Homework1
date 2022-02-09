package com.example.cs301homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create and register red seekbar
        TextView redValue = findViewById(R.id.redValue);
        SeekBar.OnSeekBarChangeListener redBarListener = new UpdateRedValue(redValue);
        SeekBar redSeekBar = findViewById(R.id.redBar);

        //Create and register green seekbar
        TextView greenValue = findViewById(R.id.greenValue);
        SeekBar.OnSeekBarChangeListener greenBarListener = new UpdateRedValue(greenValue);
        SeekBar greenSeekBar = findViewById(R.id.greenBar);

        //Create and register blue seekbar
        TextView blueValue = findViewById(R.id.blueValue);
        SeekBar.OnSeekBarChangeListener blueBarListener = new UpdateRedValue(blueValue);
        SeekBar blueSeekBar = findViewById(R.id.blueBar);

        //Set values to change based on seekbar location
        redSeekBar.setOnSeekBarChangeListener(redBarListener);
        greenSeekBar.setOnSeekBarChangeListener(greenBarListener);
        blueSeekBar.setOnSeekBarChangeListener(blueBarListener);



    }
}