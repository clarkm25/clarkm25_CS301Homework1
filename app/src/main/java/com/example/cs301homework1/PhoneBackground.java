package com.example.cs301homework1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class PhoneBackground {

    private Paint paint;
    private int red;
    private int green;
    private int blue;
    private float sX;
    private float sY;
    private float eX;
    private float eY;

    //ctor
    public PhoneBackground(float startX, float startY, float endX, float endY, int initRed, int initGreen, int initBlue) {
        sX = startX;
        sY = startY;
        eX = endX;
        eY = endY;
        red = initRed;
        green = initGreen;
        blue = initBlue;

        int color = Color.rgb(red, green, blue);
        paint = new Paint();
        paint.setColor(color);
    }

    public void drawPhoneBackground(Canvas canvas) {
        canvas.drawRect(sX, sY, eX, eY, paint);
    }
}
