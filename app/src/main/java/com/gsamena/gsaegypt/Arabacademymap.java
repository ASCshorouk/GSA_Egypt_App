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

public class Arabacademymap extends Activity {


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
		Intent i = new Intent(Arabacademymap.this, No_Internet.class);
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
		   webView.loadUrl("https://www.google.com/maps/place/Arab+Academy+For+Science,+Technology+%26+Maritime+Transport/@30.0963184,31.3736648,17z/data=!4m5!1m2!2m1!1sArab+Academy+For+Science,+Technology+%26+Maritime+Transport,+Al+Matar,+Qism+El-Nozha,+Cairo+Governorate,+Egypt!3m1!1s0x1458161427e28abb:0x6258e0ca55113e35");

		   
		   
		   
		   
		   
		   
		   
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
