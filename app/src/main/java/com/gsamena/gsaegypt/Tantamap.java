package com.gsamena.gsaegypt;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.DetailedState;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Tantamap extends Activity {


	   WebView webView;


	
ProgressBar  pBar;

Handler h;



	
String mapPath = "http://maps.google.com/maps";
	
	  // private String url = "http://maps.google.com/maps";
	   
	   
public void CheckConnection() {

	final ConnectivityManager connMgr = (ConnectivityManager) this
			.getSystemService(Context.CONNECTIVITY_SERVICE);
	final android.net.NetworkInfo wifi = connMgr
			.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
	final android.net.NetworkInfo mobile = connMgr
			.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
	if (wifi.isAvailable()
			&& wifi.getDetailedState() == DetailedState.CONNECTED) {
		// Toast.makeText(this, "You are Connected by Wifi" , 5000).show();
	} else if (mobile.isAvailable()
			&& mobile.getDetailedState() == DetailedState.CONNECTED) {
		// Toast.makeText(this, "You ara Connected by Mobile 3G" ,
		// 5000).show();
		// LoadProgress();
	} else {
		Intent i = new Intent(Tantamap.this, No_Internet.class);
		startActivity(i);
	
	finish();

	}
}
	   
	   
	   
		public void Load() {
			
			pBar = (ProgressBar)findViewById(com.gsamena.gsaegypt.R.id.progressBar1);
			
			
			h = new Handler();
			pBar.setVisibility(ProgressBar.VISIBLE);
			Thread TH = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int i = 0; i < 100; i += 3) {
						pBar.setProgress(i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();

						}
					}
					h.post(new Runnable() {
						public void run() {
							pBar.setVisibility(ProgressBar.GONE);

						}
					});

				}
			});
			TH.start();
		}


	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.gsamena.gsaegypt.R.layout.shoroukmap);
		

		
		/**
		myWebView = (WebView)findViewById(R.id.webView1);
		myWebView.getSettings().setJavaScriptEnabled(true);
  String map2="?q=43.0054446,-87.9678884&t=m&z=7";
  myWebView.loadUrl(mapPath+map2); 
		**/
		
		CheckConnection();
		
		Load();
		
		   webView = (WebView)findViewById(com.gsamena.gsaegypt.R.id.webView1);
		   webView.setWebViewClient(new WebViewClient());
		   WebSettings webSettings = webView.getSettings();
		   webSettings.setJavaScriptEnabled(true);
		  // webView.loadUrl("http://maps.google.com/maps?z=17&t=h&q=loc:30.051451,31.345840");
		   webView.loadUrl("https://www.google.com/maps/place/Faculty+Of+Medicine+-+Tanta+University/@30.7994626,30.9916323,17z/data=!3m1!4b1!4m2!3m1!1s0x14f7c90980d600b3:0x30c1a0991bcafa2e");

		   
		   
		   
		   
		   
		   
		   
	}
	
	 // To handle "Back" key press event for WebView to go back to previous screen.
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
			webView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
}
