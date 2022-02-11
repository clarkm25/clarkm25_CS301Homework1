package com.example.cs301homework1;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * UpdateRedValue
 *
 * @author Max Clark
 *
 * Updates the RED values in DrawClassModel which then changes the red value of the paint
 * for a specified object. This class uses a seekbar to create said change.
 */
public class UpdateRedValue implements SeekBar.OnSeekBarChangeListener {

    private TextView redCount;
    private DrawClassModel drawModel;
    private DrawClass drawClass;


    public UpdateRedValue(TextView initRed, DrawClass initDrawClass) {
        this.redCount = initRed;
        this.drawClass = initDrawClass;
        this.drawModel = drawClass.getModel();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

        int seekBarId = seekBar.getId();

        if (seekBarId == R.id.redBar) {
            if (drawModel.a1 == true) {
                drawModel.a1Red = progress;
            } else if (drawModel.a2 == true) {
                this.redCount.setText("" + drawModel.a2Red);
                drawModel.a2Red = progress;
            } else if (drawModel.a3 == true) {
                this.redCount.setText("" + drawModel.a3Red);
                drawModel.a3Red = progress;
            } else if (drawModel.a4 == true) {
                this.redCount.setText("" + drawModel.a4Red);
                drawModel.a4Red = progress;
            } else if (drawModel.a5 == true) {
                this.redCount.setText("" + drawModel.a5Red);
                drawModel.a5Red = progress;
            } else if (drawModel.a6 == true) {
                this.redCount.setText("" + drawModel.a6Red);
                drawModel.a6Red = progress;
            } else if (drawModel.pBackground == true) {
                this.redCount.setText("" + drawModel.pBackgroundRed);
                drawModel.pBackgroundRed = progress;
            } else if (drawModel.pFrame == true) {
                this.redCount.setText("" + drawModel.pFrameRed);
                drawModel.pFrameRed = progress;
            }

            this.redCount.setText("" + progress);
        }
        drawClass.invalidate();


    }

    /**
     * onStartTrackingTouch
     *
     * Method implemented by SeekBar.OnChangeListener; however, it is not needed.
     */
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Does not need to do anything
    }

    /**
     * onStopTrackingTouch
     *
     * Method implemented by SeekBar.OnChangeListener; however, it is not needed.
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Does not need to do anything
    }
}
