package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewPots extends Activity implements OnClickListener
{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpots);
		Button beefpots = (Button) findViewById(R.id.beefpots);
		beefpots.setOnClickListener(this);
		Button seafoodpots = (Button) findViewById(R.id.seafoodpots);
		seafoodpots.setOnClickListener(this);
		Button doogolepots = (Button) findViewById(R.id.doogolepots);
		doogolepots.setOnClickListener(this);
		Button gaegookpots = (Button) findViewById(R.id.gaegookpots);
		gaegookpots.setOnClickListener(this);
		Button mushroompots = (Button) findViewById(R.id.mushroompots);
		mushroompots.setOnClickListener(this);
		Button fishcakepots = (Button) findViewById(R.id.fishcakepots);
		fishcakepots.setOnClickListener(this);
		Button ribpots = (Button) findViewById(R.id.ribpots);
		ribpots.setOnClickListener(this);
		Button musselpots = (Button) findViewById(R.id.musselpots);
		musselpots.setOnClickListener(this);
	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent init = new Intent(this, DynamicPots.class);
		switch(arg0.getId()){
		case R.id.beefpots:
			init.putExtra("menu", "beefpots");
			break;
		case R.id.seafoodpots:
			init.putExtra("menu", "seafoodpots");
			break;
		case R.id.doogolepots:
			init.putExtra("menu", "doogolepots");
			break;
		case R.id.gaegookpots:
			init.putExtra("menu", "gaegookpots");
			break;
		case R.id.mushroompots:
			init.putExtra("menu", "mushroompots");
			break;
		case R.id.fishcakepots:
			init.putExtra("menu", "fishcakepots");
			break;
		case R.id.ribpots:
			init.putExtra("menu", "ribpots");
			break;
		case R.id.musselpots:
			init.putExtra("menu", "musselpots");
			break;
			}
		startActivity(init);
	}
}
