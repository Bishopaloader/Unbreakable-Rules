package com.example.unbreakablerules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SendSms2 extends Activity implements OnClickListener {

	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clickertosms);
		findViewById(R.id.button2).setOnClickListener(this);
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button3).setOnClickListener(this);
		findViewById(R.id.button4).setOnClickListener(this);
		findViewById(R.id.button5).setOnClickListener(this);
		findViewById(R.id.button6).setOnClickListener(this);
		findViewById(R.id.button7).setOnClickListener(this);
		findViewById(R.id.button8).setOnClickListener(this);
		findViewById(R.id.button9).setOnClickListener(this);
	}
	private void sendSMS(String phonenumber, String message) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
		SmsManager sms = SmsManager.getDefault();
	       sms.sendTextMessage(phonenumber, null, message, null, null);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			sendSMS("9687395092", "Anti-Alcohol/Smoking/Illegal Activities observed in college.");	
			startActivity(new Intent(SendSms2.this,SendSms.class));
			break;
		case R.id.button2:
			sendSMS("9687395092", "Ragging Observed in College.");
			startActivity(new Intent(SendSms2.this,SendSms2.class));
			break;
		case R.id.button3:
			sendSMS("9687395092", "First Aid required!");	
			startActivity(new Intent(SendSms2.this,SendSms3.class));
			break;
		case R.id.button4:
			sendSMS("9687395092", "Parking Problem Observed");	
			startActivity(new Intent(SendSms2.this,SendSms4.class));
			break;
		case R.id.button5:
			sendSMS("9687395092", "Washroom Problem Found eg- No water in hostel, No proper cleaniness of sanitation");	
			startActivity(new Intent(SendSms2.this,SendSms5.class));
			break;
		case R.id.button6:
			sendSMS("9687395092", "Rape or Illegal Sex observed in Campus");	
			startActivity(new Intent(SendSms2.this,SendSms6.class));
			break;
		case R.id.button7:
			sendSMS("9687395092", "Lecture Hall Problem eg: Marker Needed, No projector Working");	
			startActivity(new Intent(SendSms2.this,SendSms7.class));
			break;
		case R.id.button8:
			sendSMS("9687395092", "Lab Technical Issue eg: Computer Not working, AC Switched OFF ");	
			startActivity(new Intent(SendSms2.this,SendSms8.class));
			break;
		case R.id.button9:
			sendSMS("9687395092", "Someone from college service will call you in an hour!");	
			startActivity(new Intent(SendSms2.this,SendSms9.class));
			break;

		default:
			break;
		}
	}
}
