package com.carleton.comp6605project;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
	Paint paint;

	public DrawView(Context context) {
		super(context);
		paint = new Paint();
		paint.setColor(Color.BLUE);
	}

	@Override
	public void onDraw(Canvas canvas) {
		canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, 200,
				paint);

	}

}