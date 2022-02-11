package com.example.clarkm25_cs301homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Class that creates each action as well as the actual screen that everything is
 * portrayed on.
 *
 * @author Max Clark
 * @version 10 February 2022
 */
public class MainActivity extends AppCompatActivity {
    private DrawClass drawings;
    private View touchedDrawing;
    private SeekBar redSeek;
    private SeekBar greenSeek;
    private SeekBar blueSeek;

    /**
     * onCreate
     *
     * Creates an instance of the Controller class as well as the SeekBars and TextViews
     * in order to allow the Controller class to have access to them and modified them.
     *
     * @param savedInstanceState    Bundle used to create and portray the different layouts and
     *                              classes provided.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextViews that display object being modified as well as the values of each SeekBar
        TextView drawingText = findViewById(R.id.title);
        TextView redValue = findViewById(R.id.redValue);
        TextView greenValue = findViewById(R.id.greenValue);
        TextView blueValue = findViewById(R.id.blueValue);

        //Initializes instance variables for the red, green, and blue SeekBars
        redSeek = findViewById(R.id.redBar);
        greenSeek = findViewById(R.id.greenBar);
        blueSeek = findViewById(R.id.blueBar);

        //Initializes DrawClass variable as well as creating a new controller for said DrawClass
        drawings = findViewById(R.id.drawClass);
        DrawClassController newDrawing = new DrawClassController(drawingText, redValue, greenValue,
                blueValue, drawings, redSeek, greenSeek, blueSeek);

        //Initializes a View and provides it with the controller in order to allow for
        // onTouch events
        touchedDrawing = findViewById(R.id.drawClass);
        touchedDrawing.setOnTouchListener(newDrawing);

        //Initializes the red, green, and blue SeekBars and provides it with the controller
        // in order to allow for onProgressChanged events
        redSeek.setOnSeekBarChangeListener(newDrawing);
        greenSeek.setOnSeekBarChangeListener(newDrawing);
        blueSeek.setOnSeekBarChangeListener(newDrawing);
    }
}