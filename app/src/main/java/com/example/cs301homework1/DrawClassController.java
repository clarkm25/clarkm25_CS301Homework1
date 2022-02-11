package com.example.cs301homework1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Controller for the DrawClass. Allows users to perform touch events on the surface view.
 *
 * @author Max Clark
 * @version 10 February 2022
 */
public class DrawClassController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener{

    //Create instance variables
    private DrawClass drawView;
    private DrawClassModel drawModel;
    private TextView drawingText;
    private TextView redText;
    private TextView greenText;
    private TextView blueText;
    private SeekBar redSeek;
    private SeekBar greenSeek;
    private SeekBar blueSeek;

    /**
     * DrawClassController
     *
     * Constructor that initializes the views that are to be changed by the onTouchListener
     *
     * @param initText        TextView that displays the name of the selected object
     * @param initRedText     TextView that displays the red SeekBar progress value
     * @param initGreenText   TextView that displays the green SeekBar progress value
     * @param initBlueText    TextView that displays the blue SeekBar progress value
     * @param initDrawView    SurfaceView that changes are being made on
     * @param initRedSeek     Red SeekBar that changes are being made on
     * @param initGreenSeek   Green SeekBar that changes are being made on
     * @param initBlueSeek    Blue SeekBar that changes are being made on
     */
    public DrawClassController(TextView initText, TextView initRedText, TextView initGreenText,
                               TextView initBlueText, DrawClass initDrawView,
                               SeekBar initRedSeek, SeekBar initGreenSeek, SeekBar initBlueSeek) {
        //Initialize variables
        drawView = initDrawView;
        drawModel = drawView.getModel();
        drawingText = initText;
        redText = initRedText;
        greenText = initGreenText;
        blueText = initBlueText;
        redSeek = initRedSeek;
        greenSeek = initGreenSeek;
        blueSeek = initBlueSeek;
    }

    /**
     * onTouch
     *
     * Takes an x and y position based on a user's touch and changes the text view that
     * describes the object as well as changes which object is being modified.
     *
     * @param view      Surface View that the touch event is being made on.
     * @param motionEvent   Describes the type of event occurring.
     *
     * @return      Returns a boolean stating whether or not this method has performed
     *              the required task.
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        //Find location of the touch event
        float x = (float)motionEvent.getX();
        float y = (float)motionEvent.getY();

        //App 1
        if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 95.0f) && (y <= 195.0f))) {
            drawModel.a1 = true; //Allows seekbar to make changes to App 1
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pBackground = false;

            //Sets RGB texts to the initial values of each object
            this.redText.setText("" + drawModel.a1Red);
            this.greenText.setText("" + drawModel.a1Green);
            this.blueText.setText("" + drawModel.a1Blue);
            this.drawingText.setText("App 1");

            //Sets seekbar progress to the RGB values of each object
            this.redSeek.setProgress(drawModel.a1Red);
            this.greenSeek.setProgress(drawModel.a1Green);
            this.blueSeek.setProgress(drawModel.a1Blue);
        }
        //App 2
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 95.0f) && (y <= 195.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = true; //Allows seekbar to make changes to App 2
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.a2Red);
            this.greenText.setText("" + drawModel.a2Green);
            this.blueText.setText("" + drawModel.a2Blue);
            this.drawingText.setText("App 2");

            this.redSeek.setProgress(drawModel.a2Red);
            this.greenSeek.setProgress(drawModel.a2Green);
            this.blueSeek.setProgress(drawModel.a2Blue);
        }
        //App 3
        else if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 295.0f) && (y <= 395.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = false;
            drawModel.a3 = true; //Allows seekbar to make changes to App 3
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.a3Red);
            this.greenText.setText("" + drawModel.a3Green);
            this.blueText.setText("" + drawModel.a3Blue);
            this.drawingText.setText("App 3");

            this.redSeek.setProgress(drawModel.a3Red);
            this.greenSeek.setProgress(drawModel.a3Green);
            this.blueSeek.setProgress(drawModel.a3Blue);
        }
        //App 4
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 295.0f) && (y <= 395.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = true; //Allows seekbar to make changes to App 4
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.a4Red);
            this.greenText.setText("" + drawModel.a4Green);
            this.blueText.setText("" + drawModel.a4Blue);
            this.drawingText.setText("App 4");

            this.redSeek.setProgress(drawModel.a4Red);
            this.greenSeek.setProgress(drawModel.a4Green);
            this.blueSeek.setProgress(drawModel.a4Blue);
        }
        //App 5
        else if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 515.0f) && (y <= 615.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = true; //Allows seekbar to make changes to App 5
            drawModel.a6 = false;
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.a5Red);
            this.greenText.setText("" + drawModel.a5Green);
            this.blueText.setText("" + drawModel.a5Blue);
            this.drawingText.setText("App 5");

            this.redSeek.setProgress(drawModel.a5Red);
            this.greenSeek.setProgress(drawModel.a5Green);
            this.blueSeek.setProgress(drawModel.a5Blue);
        }
        //App 6
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 515.0f) && (y <= 615.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = true; //Allows seekbar to make changes to App 6
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.a6Red);
            this.greenText.setText("" + drawModel.a6Green);
            this.blueText.setText("" + drawModel.a6Blue);
            this.drawingText.setText("App 6");

            this.redSeek.setProgress(drawModel.a6Red);
            this.greenSeek.setProgress(drawModel.a6Green);
            this.blueSeek.setProgress(drawModel.a6Blue);
        }
        //Phone Background
        else if(((x >= 725.0f) && (x <= 1275.0f)) && ((y >= 65.0f) && (y <= 685.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pBackground = true; //Allows seekbar to make changes to Phone Background

            this.redText.setText("" + drawModel.pBackgroundRed);
            this.greenText.setText("" + drawModel.pBackgroundGreen);
            this.blueText.setText("" + drawModel.pBackgroundBlue);
            this.drawingText.setText("Phone Background");

            this.redSeek.setProgress(drawModel.pBackgroundRed);
            this.greenSeek.setProgress(drawModel.pBackgroundGreen);
            this.blueSeek.setProgress(drawModel.pBackgroundBlue);
        }

        //Tells DrawClass to redraw the surface view
        drawView.invalidate();

        return true;
    } //onTouch

    /**
     * onProgressChanged
     *
     * Compares provided seekbar to red, green, and blue seekbars and changes progress of the
     * given seekbar. This progress change then also changes the RGB values of each object within
     * the Model class.
     *
     * Method also changes text for the RGB values above the seekbars according to the progress change
     * made.
     *
     * @param seekBar   SeekBar that changes are being made to.
     * @param progress  The progress made on the provided SeekBar.
     * @param b         Tells program whether or not the change was made by a user.
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        int seekBarId = seekBar.getId();

        /**
         * External Citation
         * Date: 9 February 2022
         *
         * Problem: Did not know how to use multiple SeekBars within a single onProgressChanged
         * method.
         *
         * Resource: https://stackoverflow.com/questions/8719632/multiple-seekbars-listener
         *
         * Solution: Used the idea of comparing the ID of the provided SeekBar with that of the
         * different red, green, and blue SeekBars. However, I used if/ if else statements
         * instead of the case switches used in the example.
         */
        if (seekBarId == R.id.redBar) {
            if (drawModel.a1 == true) { //App 1
                drawModel.a1Red = progress;
            }
            else if (drawModel.a2 == true) { //App 2
                drawModel.a2Red = progress;
            }
            else if (drawModel.a3 == true) { //App 3
                drawModel.a3Red = progress;
            }
            else if (drawModel.a4 == true) { //App 4
                drawModel.a4Red = progress;
            }
            else if (drawModel.a5 == true) { //App 5
                drawModel.a5Red = progress;
            }
            else if (drawModel.a6 == true) { //App 6
                drawModel.a6Red = progress;
            }
            else if (drawModel.pBackground == true) { //Phone Background
                drawModel.pBackgroundRed = progress;
            }

            this.redText.setText("" + progress);
        }
        else if (seekBarId == R.id.greenBar) {
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

            this.greenText.setText("" + progress);
        }
        else if (seekBarId == R.id.blueBar) {
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

            this.blueText.setText("" + progress);
        }

        //Tells DrawClass to redraw itself
        drawView.invalidate();
    } //onProgressChanged

    /**
     * onStartTrackingTouch
     *
     * Method not needed for program
     *
     * @param seekBar   SeekBar that changes are being made to
     */
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Not needed
    }

    /**
     * onStopTrackingTouch
     *
     * Method not needed for program
     *
     * @param seekBar   SeekBar that changes are being made to
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Not needed
    }
} //DrawClassController
