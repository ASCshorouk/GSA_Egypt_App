package com.gsamena.gsaegypt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomePage extends Activity {
	
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.gsamena.gsaegypt.R.layout.home_page);
		
		b1 = (Button)findViewById(com.gsamena.gsaegypt.R.id.button1);
		b2 = (Button)findViewById(com.gsamena.gsaegypt.R.id.button2);
		b3 = (Button)findViewById(com.gsamena.gsaegypt.R.id.button3);
		b4 = (Button)findViewById(com.gsamena.gsaegypt.R.id.button4);
		b5 = (Button)findViewById(com.gsamena.gsaegypt.R.id.button5);
		b6 = (Button)findViewById(com.gsamena.gsaegypt.R.id.button6);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent i1 = new Intent(HomePage.this,AboutGSA.class);
				startActivity(i1);
			}
		});
		
	b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent i2 = new Intent(HomePage.this,NearbyGSA.class);
				startActivity(i2);
				
			}
		});
	
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Intent E = new Intent(HomePage.this , Googleforeducation.class);
			startActivity(E);
			
		}
	});
	
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
          Intent T = new Intent(HomePage.this , Googlejobs.class);
          startActivity(T);
		}
	});
	
	b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent y = new Intent(HomePage.this , Googlearabia.class);
			startActivity(y);
			
		}
	});
		
		
	b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
            Intent u = new Intent(HomePage.this , Imageslider.class);
            startActivity(u);
			}
		});
	
		
		
		
		

	
		
		
	}




}
