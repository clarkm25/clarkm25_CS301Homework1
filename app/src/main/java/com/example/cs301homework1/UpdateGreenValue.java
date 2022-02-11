package com.example.cs301homework1;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * UpdateGreenValue
 *
 * @author Max Clark
 *
 * Updates the GREEN values in DrawClassModel which then changes the green value of the paint
 * for a specified object. This class uses a seekbar to create said change.
 */
public class UpdateGreenValue implements SeekBar.OnSeekBarChangeListener {

    private TextView greenCount;
    private DrawClassModel drawModel;
    private DrawClass drawClass;

    public UpdateGreenValue(TextView initGreen, DrawClass initDrawClass) {
        this.greenCount = initGreen;
        this.drawClass = initDrawClass;
        drawModel = drawClass.getModel();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

        if (drawModel.a1 == true) {
            drawModel.a1Green = progress;
        }
        else if (drawModel.a2 == true) {
            drawModel.a2Green = progress;
        }
        else if (drawModel.a3 == true) {
            drawModel.a3Green = progress;
        }
        else if (drawModel.a4 == true) {
            drawModel.a4Green = progress;
        }
        else if (drawModel.a5 == true) {
            drawModel.a5Green = progress;
        }
        else if (drawModel.a6 == true) {
            drawModel.a6Green = progress;
        }
        else if (drawModel.pBackground == true) {
            drawModel.pBackgroundGreen = progress;
        }
        else if (drawModel.pFrame == true) {
            drawModel.pFrameGreen = progress;
        }
        this.greenCount.setText("" + progress);
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
