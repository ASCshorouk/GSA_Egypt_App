package com.gsamena.gsaegypt;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
	
	private static int SPLASH_TIME_OUT = 2500;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(com.gsamena.gsaegypt.R.layout.splash_screen);
		
		
		
		

		
		
		//final MediaPlayer player = MediaPlayer.create(this, R.raw.aya);
		//player.start();
		
		new Handler().postDelayed(new Runnable() {

			/*
			 * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				//Intent i = new Intent(Splash_Screen.this, MainActivity.class);
				Intent i = new Intent(SplashScreen.this, HomePage.class);

				startActivity(i);

				// close this activity
				finish();
			}
		}, SPLASH_TIME_OUT);
		
		
		
		
		
		
	}

}
