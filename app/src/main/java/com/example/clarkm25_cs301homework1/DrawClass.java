package com.example.clarkm25_cs301homework1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Class that creates a surface view and draws a series of objects for user interaction.
 *
 * @author Max Clark
 * @version 10 February 2022
 */
public class DrawClass extends SurfaceView{

    //Paints that will be used for the different objects on the surface view
    int background = 0xFFADD8E6;
    Paint appOnePaint = new Paint();
    Paint appTwoPaint = new Paint();
    Paint appThreePaint = new Paint();
    Paint appFourPaint = new Paint();
    Paint appFivePaint = new Paint();
    Paint appSixPaint = new Paint();
    Paint phoneFramePaint = new Paint();
    Paint phoneBackgroundPaint = new Paint();
    //Creates a variable of the model for DrawClass
    private DrawClassModel drawings;

    /**
     * DrawClass
     *
     * Constructor for DrawClass. Initializes the model for the DrawClass as well as
     * the different paints that are used for each object on the surface view
     *
     * @param context
     * @param attrib
     */
    public DrawClass(Context context, AttributeSet attrib) {
        super(context, attrib);

        //Creates new instance of the DrawClassModel
        drawings = new DrawClassModel();

        //Shows drawing on surface view
        setWillNotDraw(false);

        this.setBackgroundColor(background);
    }

    /**
     * onDraw
     *
     * Draws each object on the surface view.
     *
     * @param canvas Creates the canvas that the objects are drawn on.
     */
    @Override
    public void onDraw(Canvas canvas) {
        //Initializes paints using RGB values found from the model class
        int appOneColor = Color.rgb(drawings.a1Red, drawings.a1Green, drawings.a1Blue);
        appOnePaint.setColor(appOneColor);
        int appTwoColor = Color.rgb(drawings.a2Red, drawings.a2Green, drawings.a2Blue);
        appTwoPaint.setColor(appTwoColor);
        int appThreeColor = Color.rgb(drawings.a3Red, drawings.a3Green, drawings.a3Blue);
        appThreePaint.setColor(appThreeColor);
        int appFourColor = Color.rgb(drawings.a4Red, drawings.a4Green, drawings.a4Blue);
        appFourPaint.setColor(appFourColor);
        int appFiveColor = Color.rgb(drawings.a5Red, drawings.a5Green, drawings.a5Blue);
        appFivePaint.setColor(appFiveColor);
        int appSixColor = Color.rgb(drawings.a6Red, drawings.a6Green, drawings.a6Blue);
        appSixPaint.setColor(appSixColor);
        int phoneBackgroundColor = Color.rgb(drawings.pBackgroundRed, drawings.pBackgroundGreen,
                drawings.pBackgroundBlue);
        phoneBackgroundPaint.setColor(phoneBackgroundColor);
        phoneFramePaint.setColor(Color.GRAY);

        //Phone Frame
        canvas.drawRect(700.0f, 15.0f, 1300.0f, 735.0f,phoneFramePaint);
        //Phone Background
        canvas.drawRect(725.0f,65.0f,1275.0f,685.0f,phoneBackgroundPaint);
        //App 1
        canvas.drawRect(800.0f,95.0f,900.0f,195.0f,appOnePaint);
        //App 2
        canvas.drawRect(1100.0f,95.0f,1200.0f,195.0f,appTwoPaint);
        //App 3
        canvas.drawRect(800.0f,295.0f,900.0f,395.0f,appThreePaint);
        //App 4
        canvas.drawRect(1100.0f,295.0f,1200.0f,395.0f,appFourPaint);
        //App 5
        canvas.drawRect(800.0f,515.0f,900.0f,615.0f,appFivePaint);
        //App 6
        canvas.drawRect(1100.0f,515.0f,1200.0f,615.0f,appSixPaint);
    }

    /**
     * getModel
     *
     * Gets model for DrawClass.
     *
     * @return     Returns the DrawClassModel that is used within this DrawClass.
     */
    public DrawClassModel getModel() {
        return drawings;
    }
}

