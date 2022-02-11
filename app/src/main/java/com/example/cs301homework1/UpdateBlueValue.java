package com.example.cs301homework1;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * UpdateBlueValue
 *
 * @author Max Clark
 *
 * Updates the BLUE values in DrawClassModel which then changes the blue value of the paint
 * for a specified object. This class uses a seekbar to create said change.
 */
public class UpdateBlueValue implements SeekBar.OnSeekBarChangeListener {

    private TextView blueCount;
    private DrawClass drawClass;
    private DrawClassModel drawModel;

    public UpdateBlueValue(TextView initBlue, DrawClass initDrawClass) {
        this.blueCount = initBlue;
        this.drawClass = initDrawClass;
        drawModel = drawClass.getModel();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

        if (drawModel.a1 == true) {
            drawModel.a1Blue = progress;
        }
        else if (drawModel.a2 == true) {
            drawModel.a2Blue = progress;
        }
        else if (drawModel.a3 == true) {
            drawModel.a3Blue = progress;
        }
        else if (drawModel.a4 == true) {
            drawModel.a4Blue = progress;
        }
        else if (drawModel.a5 == true) {
            drawModel.a5Blue = progress;
        }
        else if (drawModel.a6 == true) {
            drawModel.a6Blue = progress;
        }
        else if (drawModel.pBackground == true) {
            drawModel.pBackgroundBlue = progress;
        }
        else if (drawModel.pFrame == true) {
            drawModel.pFrameBlue = progress;
        }

        this.blueCount.setText("" + progress);
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
