package com.example.unbreakablerules;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	
	MediaPlayer bgmusic;
	@Override
	protected void onCreate(Bundle forsplash) {
		// TODO Auto-generated method stub
		super.onCreate(forsplash);
		setContentView(R.layout.splash);
		bgmusic = MediaPlayer.create(Splash.this, R.raw.ur);
		bgmusic.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(7500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent secondactivity = new Intent("com.example.unbreakablerules.SECONDPHASE"); 
					startActivity(secondactivity);
				}
			}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		bgmusic.release();
		finish();
	}
	}
