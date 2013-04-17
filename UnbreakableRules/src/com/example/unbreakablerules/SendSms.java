package com.example.unbreakablerules;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class SendSms extends SendSms2{

//	Button b;
//		@Override
//		protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.clickertosms);
//		findViewById(R.id.button2).setOnClickListener(this);
//		findViewById(R.id.button1).setOnClickListener(this);
//		findViewById(R.id.button3).setOnClickListener(this);
////		 b = (Button) findViewById(R.id.button1);
////	      b.setOnClickListener(new View.OnClickListener() {
////			
////			@Override
////			public void onClick(View v) {
////				// TODO Auto-generated method stub
////				sendSMS("9687395092", "Hi You got a message!");
////				startActivity(new Intent(SendSms.this,MainActivity.class));
////			}
////
////			private void sendSMS(String phonenumber, String message) {
////				// TODO Auto-generated method stub
////				SmsManager sms = SmsManager.getDefault();
////			       sms.sendTextMessage(phonenumber, null, message, null, null);
////			}
////		});
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
