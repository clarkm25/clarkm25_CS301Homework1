package com.example.cs301homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * MainActivity
 *
 * @author Max Clark
 *
 * Class that creates ...
 */
public class MainActivity extends AppCompatActivity {
    private DrawClass drawings;
    private View touchedDrawing;
    private SeekBar redSeek;
    private SeekBar greenSeek;
    private SeekBar blueSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView drawingText = findViewById(R.id.title);
        TextView redValue = findViewById(R.id.redValue);
        TextView greenValue = findViewById(R.id.greenValue);
        TextView blueValue = findViewById(R.id.blueValue);

        redSeek = findViewById(R.id.redBar);
        greenSeek = findViewById(R.id.greenBar);
        blueSeek = findViewById(R.id.blueBar);

        drawings = findViewById(R.id.drawClass);
        DrawClassController newDrawing = new DrawClassController(drawingText, redValue, greenValue,
                blueValue, drawings, redSeek, greenSeek, blueSeek);

        touchedDrawing = findViewById(R.id.drawClass);
        touchedDrawing.setOnTouchListener(newDrawing);

        redSeek.setOnSeekBarChangeListener(newDrawing);
        greenSeek.setOnSeekBarChangeListener(newDrawing);
        blueSeek.setOnSeekBarChangeListener(newDrawing);
    }
}