package com.example.cs301homework1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * DrawClassController
 *
 * @author Max Clark
 *
 * Controller for the DrawClass. Allows users to perform touch events on the surface view.
 */
public class DrawClassController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener{

    //Initialize variables
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
     */
    public DrawClassController(TextView initText, TextView initRedText, TextView initGreenText,
                               TextView initBlueText, DrawClass initDrawView,
                               SeekBar initRedSeek, SeekBar initGreenSeek, SeekBar initBlueSeek) {
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
     * Takes an x and y position based on a user's touch and changes the text view that describes the object as
     * well as changes which object is being modified.
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        //Find location of the touch event
        float x = (float)motionEvent.getX();
        float y = (float)motionEvent.getY();

        //App 1
        if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 95.0f) && (y <= 195.0f))) {
            drawModel.a1 = true;
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pFrame = false;
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.a1Red);
            this.greenText.setText("" + drawModel.a1Green);
            this.blueText.setText("" + drawModel.a1Blue);
            this.drawingText.setText("App 1");

            this.redSeek.setProgress(drawModel.a1Red);
            this.greenSeek.setProgress(drawModel.a1Green);
            this.blueSeek.setProgress(drawModel.a1Blue);
        }
        //App 2
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 95.0f) && (y <= 195.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = true;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pFrame = false;
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
            drawModel.a3 = true;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pFrame = false;
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
            drawModel.a4 = true;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pFrame = false;
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
            drawModel.a5 = true;
            drawModel.a6 = false;
            drawModel.pFrame = false;
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
            drawModel.a6 = true;
            drawModel.pFrame = false;
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
            drawModel.pFrame = true;
            drawModel.pBackground = false;

            this.redText.setText("" + drawModel.pBackgroundRed);
            this.greenText.setText("" + drawModel.pBackgroundGreen);
            this.blueText.setText("" + drawModel.pBackgroundBlue);
            this.drawingText.setText("Phone Background");

            this.redSeek.setProgress(drawModel.pBackgroundRed);
            this.greenSeek.setProgress(drawModel.pBackgroundGreen);
            this.blueSeek.setProgress(drawModel.pBackgroundBlue);
        }
        //Phone Frame
        else if(((x >= 700.0f) && (x <= 1300.0f)) && ((y >= 15.0f) && (y <= 735.0f))) {
            drawModel.a1 = false;
            drawModel.a2 = false;
            drawModel.a3 = false;
            drawModel.a4 = false;
            drawModel.a5 = false;
            drawModel.a6 = false;
            drawModel.pFrame = false;
            drawModel.pBackground = true;

            this.redText.setText("" + drawModel.pFrameRed);
            this.greenText.setText("" + drawModel.pFrameGreen);
            this.blueText.setText("" + drawModel.pFrameBlue);
            drawingText.setText("Phone Frame");

            this.redSeek.setProgress(drawModel.pFrameRed);
            this.greenSeek.setProgress(drawModel.pFrameGreen);
            this.blueSeek.setProgress(drawModel.pFrameBlue);
        }

        drawView.invalidate();

        return true;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        int seekBarId = seekBar.getId();

        if (seekBarId == R.id.redBar) {
            if (drawModel.a1 == true) {
                drawModel.a1Red = progress;
            } else if (drawModel.a2 == true) {
                drawModel.a2Red = progress;
            } else if (drawModel.a3 == true) {
                drawModel.a3Red = progress;
            } else if (drawModel.a4 == true) {
                drawModel.a4Red = progress;
            } else if (drawModel.a5 == true) {
                drawModel.a5Red = progress;
            } else if (drawModel.a6 == true) {
                drawModel.a6Red = progress;
            } else if (drawModel.pBackground == true) {
                drawModel.pBackgroundRed = progress;
            } else if (drawModel.pFrame == true) {
                drawModel.pFrameRed = progress;
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
            else if (drawModel.pFrame == true) {
                drawModel.pFrameGreen = progress;
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
            else if (drawModel.pFrame == true) {
                drawModel.pFrameBlue = progress;
            }

            this.blueText.setText("" + progress);
        }

        drawView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Not needed
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Not needed
    }
}
