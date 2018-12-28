package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewRoast extends Activity implements OnClickListener
{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewroast);
		Button skewers = (Button) findViewById(R.id.skewers);
		skewers.setOnClickListener(this);
		Button mackerelgrill = (Button) findViewById(R.id.mackerelgrill);
		mackerelgrill.setOnClickListener(this);
		Button shellfishgrill = (Button) findViewById(R.id.shellfishgrill);
		shellfishgrill.setOnClickListener(this);
		Button shadgrill = (Button) findViewById(R.id.shadgrill);
		shadgrill.setOnClickListener(this);
		Button croakergrill = (Button) findViewById(R.id.croakergrill);
		croakergrill.setOnClickListener(this);
		Button seriolagrill = (Button) findViewById(R.id.seriolagrill);
		seriolagrill.setOnClickListener(this);
		Button beefgrill = (Button) findViewById(R.id.beefgrill);
		beefgrill.setOnClickListener(this);
		Button cuttlefishgrill = (Button) findViewById(R.id.cuttlefishgrill);
		cuttlefishgrill.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		Intent init = new Intent(this, DynamicRoast.class);
		switch(v.getId()){
		case R.id.skewers:
			init.putExtra("menu", "skewers");
			break;
		case R.id.mackerelgrill:
			init.putExtra("menu", "mackerelgrill");
			break;
		case R.id.shellfishgrill:
			init.putExtra("menu", "shellfishgrill");
			break;
		case R.id.shadgrill:
			init.putExtra("menu", "shadgrill");
			break;
		case R.id.croakergrill:
			init.putExtra("menu", "croakergrill");
			break;
		case R.id.seriolagrill:
			init.putExtra("menu", "seriolagrill");
			break;
		case R.id.beefgrill:
			init.putExtra("menu", "beefgrill");
			break;
		case R.id.cuttlefishgrill:
			init.putExtra("menu", "cuttlefishgrill");
			break;
		}
		startActivity(init);
	}
}
