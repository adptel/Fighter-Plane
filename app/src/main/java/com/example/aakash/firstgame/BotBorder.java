package com.example.aakash.firstgame;

/**
 * Created by Aakash on 7/29/2015.
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class BotBorder extends GameObject{

    private Bitmap image;
    public BotBorder(Bitmap res, int x, int y)
    {
        height = 200;
        width = 20;

        this.x = x;
        this.y = y;
        dx = GamePanel.MOVESPEED;

        image = Bitmap.createBitmap(res, 0, 0, width, height);

    }
    public void update()
    {
        x +=dx;

    }
    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(image, x, y, null);

    }
}
