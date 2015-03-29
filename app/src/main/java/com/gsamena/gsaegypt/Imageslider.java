package com.gsamena.gsaegypt;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;



public class Imageslider extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(com.gsamena.gsaegypt.R.layout.activity_imageslider);
		ViewPager viewPager = (ViewPager) findViewById(com.gsamena.gsaegypt.R.id.view_pager);
		ImageAdapter adapter = new ImageAdapter(this);
		viewPager.setAdapter(adapter);

	}
}
