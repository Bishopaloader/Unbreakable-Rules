package com.example.unbreakablerules;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Secondphase extends Activity implements OnClickListener{

	Button rule, share;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondphase);
		rule = (Button) findViewById(R.id.rules);
		share = (Button) findViewById(R.id.share);
		
		rule.setOnClickListener(this);
		share.setOnClickListener(this);
	}
	@Override
	public void onClick(View arg0) {

			switch(arg0.getId()){
			case R.id.rules:
			startActivity(new Intent(Secondphase.this,Menu.class));
			break;
			case R.id.share:
			startActivity(new Intent(Secondphase.this,SendSms2.class));
			break;
			default:
			Toast.makeText(getApplicationContext(),arg0.toString(),Toast.LENGTH_SHORT).show();
			}
		
	}

}
