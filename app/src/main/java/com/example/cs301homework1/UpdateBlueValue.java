package com.example.cs301homework1;

import android.widget.SeekBar;
import android.widget.TextView;

public class UpdateBlueValue implements SeekBar.OnSeekBarChangeListener {

    private TextView blueCount;
    private int blue;

    public UpdateBlueValue(TextView initBlue) {
        this.blueCount = initBlue;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.blueCount.setText("" + i);
        blue = seekBar.getProgress();
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
