package com.example.cs301homework1;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

public class DrawClass extends SurfaceView{

    private int lightBlue = 0xFFADD8E6;
    private PhoneFrame phoneFrame;
    private PhoneBackground phoneBackground;
    private App app1;
    private App app2;
    private App app3;
    private App app4;
    private App app5;
    private App app6;

    public DrawClass(Context context) {
        super(context);
        initialize();
    }

    public DrawClass(Context context, AttributeSet attrib) {
        super(context, attrib);
        initialize();
    }

    public void initialize() {
        //Shows drawing on surface view
        setWillNotDraw(false);

        //this.setOnTouchListener(this);

        this.setBackgroundColor(lightBlue);

        phoneFrame = new PhoneFrame(700.0f, 15.0f, 1300.0f, 735.0f, 100,100,100);
        phoneBackground = new PhoneBackground(725.0f,65.0f,1275.0f,685.0f,0,0,0);
        app1 = new App(800.0f,95.0f,900.0f,195.0f,200,200,200);
        app2 = new App(1100.0f,95.0f,1200.0f,195.0f,200,200,200);
        app3 = new App(800.0f,295.0f,900.0f,395.0f,200,200,200);
        app4 = new App(1100.0f,295.0f,1200.0f,395.0f,200,200,200);
        app5 = new App(800.0f,515.0f,900.0f,615.0f,200,200,200);
        app6 = new App(1100.0f,515.0f,1200.0f,615.0f,200,200,200);

    }

    @Override
    public void onDraw(Canvas canvas) {
        phoneFrame.drawPhoneFrame(canvas);
        phoneBackground.drawPhoneBackground(canvas);
        app1.drawApp(canvas);
        app2.drawApp(canvas);
        app3.drawApp(canvas);
        app4.drawApp(canvas);
        app5.drawApp(canvas);
        app6.drawApp(canvas);
    }
}

