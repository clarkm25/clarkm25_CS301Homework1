package com.example.cs301homework1;

import android.widget.SeekBar;
import android.widget.TextView;

public class UpdateRedValue implements SeekBar.OnSeekBarChangeListener {

    private TextView redCount;
    private int red;


    public UpdateRedValue(TextView initRed) {
        this.redCount = initRed;

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.redCount.setText("" + i);
        red = seekBar.getProgress();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Does not need to do anything
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Does not need to do anything
    }
}
