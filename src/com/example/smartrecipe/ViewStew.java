package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewStew extends Activity implements OnClickListener{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewstew);
		Button kimchistew = (Button) findViewById(R.id.kimchistew);
		kimchistew.setOnClickListener(this);
		Button misostew = (Button) findViewById(R.id.misostew);
		misostew.setOnClickListener(this);
		Button tofustew = (Button) findViewById(R.id.tofustew);
		tofustew.setOnClickListener(this);
		Button pumpkinstew = (Button) findViewById(R.id.pumpkinstew);
		pumpkinstew.setOnClickListener(this);
		Button horseradishstew = (Button) findViewById(R.id.horseradishstew);
		horseradishstew.setOnClickListener(this);
		Button pollackstew = (Button) findViewById(R.id.pollackstew);
		pollackstew.setOnClickListener(this);
		Button squidstew = (Button) findViewById(R.id.squidstew);
		squidstew.setOnClickListener(this);
		Button soybean = (Button) findViewById(R.id.soybean);
		soybean.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent init = new Intent(this,DynamicStew.class);
		switch(arg0.getId()){
		case R.id.kimchistew:
			init.putExtra("menu", "kimchistew");
			break;
		case R.id.misostew:
			init.putExtra("menu", "misostew");
			break;
		case R.id.tofustew:
			init.putExtra("menu", "tofustew");
			break;
		case R.id.pumpkinstew:
			init.putExtra("menu", "pumpkinstew");
			break;
		case R.id.horseradishstew:
			init.putExtra("menu", "horseradishstew");
			break;
		case R.id.pollackstew:
			init.putExtra("menu", "pollackstew");
			break;
		case R.id.squidstew:
			init.putExtra("menu", "squidstew");
			break;
		case R.id.soybean:
			init.putExtra("menu", "soybean");
			break;
		}
		startActivity(init);
	}
}
