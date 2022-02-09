package com.example.cs301homework1;

import android.widget.SeekBar;
import android.widget.TextView;

public class UpdateGreenValue implements SeekBar.OnSeekBarChangeListener {

    private TextView greenCount;
    private int green;

    public UpdateGreenValue(TextView initGreen) {
        this.greenCount = initGreen;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        this.greenCount.setText("" + i);
        green = seekBar.getProgress();
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
