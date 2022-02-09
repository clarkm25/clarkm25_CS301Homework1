package com.example.cs301homework1;

import android.view.MotionEvent;
import android.view.View;

public class DrawClassController implements View.OnTouchListener{

    private DrawClass drawView;
    private DrawClassModel drawModel;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        //Find location of the touch event
        float x = (float)motionEvent.getX();
        float y = (float)motionEvent.getY();



        //App 1
        if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 95.0f) && (y <= 195.0f))) {

        }
        //App 2
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 95.0f) && (y <= 195.0f))) {

        }
        //App 3
        else if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 295.0f) && (y <= 395.0f))) {

        }
        //App 4
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 295.0f) && (y <= 395.0f))) {

        }
        //App 5
        else if(((x >= 800.0f) && (x <= 900.0f)) && ((y >= 515.0f) && (y <= 615.0f))) {

        }
        //App 6
        else if(((x >= 1100.0f) && (x <= 1200.0f)) && ((y >= 515.0f) && (y <= 615.0f))) {

        }
        //Phone Background
        else if(((x >= 725.0f) && (x <= 1275.0f)) && ((y >= 65.0f) && (y <= 685.0f))) {

        }
        //Phone Frame
        else if(((x >= 700.0f) && (x <= 1300.0f)) && ((y >= 15.0f) && (y <= 735.0f))) {

        }

        return true;
    }
}
