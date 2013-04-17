package com.example.unbreakablerules;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	String[] classes = {"Anti-Alcohol, Smoking and Bad Practices at Colleges","Ragging at Colleges","Rape/Sex Illegaly","Penalties of Breaking Traffic Rules"};

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_expandable_list_item_1, classes));		// for making list    
		// <data type>(class name,how menu will look,array name)
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		System.out.print("here");
		super.onListItemClick(l, v, position, id);
		//String cheese = classes[position];
		try{
		//Class ourClass = Class.forName("com.example.checkyoutpnrstatus." + classes[position]);
		//Toast.makeText(getApplicationContext(), cheese, Toast.LENGTH_LONG);
			if(classes[position] == "Anti-Alcohol, Smoking and Bad Practices at Colleges"){
		Intent ourIntent = new Intent(Menu.this,Alcohol.class );
		startActivity(ourIntent);
		}
		else if(classes[position] == "Ragging at Colleges"){
			Intent ourIntent = new Intent(Menu.this,Ragging.class );
			startActivity(ourIntent);
			}
		else if(classes[position] == "Rape/Sex Illegaly"){
				Intent ourIntent = new Intent(Menu.this,Rape.class );
				startActivity(ourIntent);
			}
		else if(classes[position] == "Penalties of Breaking Traffic Rules"){
				Intent ourIntent = new Intent(Menu.this,Traffic.class );
				startActivity(ourIntent);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
