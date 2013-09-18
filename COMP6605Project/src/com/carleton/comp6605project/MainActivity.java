package com.carleton.comp6605project;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

	private DrawView drawView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		drawView = new DrawView(this);
		drawView.setBackgroundColor(Color.BLACK);
		setContentView(drawView);

		drawView.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getX() > drawView.getWidth() / 2) {
					drawView.setBackgroundColor(Color.GREEN);
				} else {
					drawView.setBackgroundColor(Color.WHITE);
				}

				return true;
			}
		});
	}
}