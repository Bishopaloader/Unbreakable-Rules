package com.example.unbreakablerules;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SendSms9 extends SendSms2 {

	/*Button b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clickertosms);
		 b2 = (Button) findViewById(R.id.button3);
	      b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendSMS("5556", "Hi You got a message frm 3!");	
			}

			private void sendSMS(String phonenumber, String message) {
				// TODO Auto-generated method stub
				SmsManager sms = SmsManager.getDefault();
			       sms.sendTextMessage(phonenumber, null, message, null, null);
			}
		});*/
	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
