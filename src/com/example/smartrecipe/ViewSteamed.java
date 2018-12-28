package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewSteamed extends Activity implements OnClickListener
{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewstreamed);
		Button steamedegg = (Button) findViewById(R.id.steamedegg);
		steamedegg.setOnClickListener(this);
		Button steamedpork = (Button) findViewById(R.id.steamedpork);
		steamedpork.setOnClickListener(this);
		Button steamedchicken = (Button) findViewById(R.id.steamedchicken);
		steamedchicken.setOnClickListener(this);
		Button steamedpollack = (Button) findViewById(R.id.steamedpollack);
		steamedpollack.setOnClickListener(this);
		Button steamedsquirt = (Button) findViewById(R.id.steamedsquirt);
		steamedsquirt.setOnClickListener(this);
		Button steamedwing = (Button) findViewById(R.id.steamedwing);
		steamedwing.setOnClickListener(this);
		Button steamedperilla = (Button) findViewById(R.id.steamedperilla);
		steamedperilla.setOnClickListener(this);
		Button steamedshank = (Button) findViewById(R.id.steamedshank);
		steamedshank.setOnClickListener(this);
		Button steamedmonkfish = (Button) findViewById(R.id.steamedmonkfish);
		steamedmonkfish.setOnClickListener(this);
	}
	@Override
	public void onClick(View v)
	{
		Intent init = new Intent(this,DynamicSteamed.class);
		switch(v.getId()){
		case R.id.steamedegg:
			init.putExtra("menu", "steamedegg");
			break;
		case R.id.steamedpork:
			init.putExtra("menu", "steamedpork");
			break;
		case R.id.steamedchicken:
			init.putExtra("menu", "steamedchicken");
			break;
		case R.id.steamedpollack:
			init.putExtra("menu", "steamedpollack");
			break;
		case R.id.steamedsquirt:
			init.putExtra("menu", "steamedsquirt");
			break;
		case R.id.steamedwing:
			init.putExtra("menu", "steamedwing");
			break;
		case R.id.steamedperilla:
			init.putExtra("menu", "steamedperilla");
			break;
		case R.id.steamedshank:
			init.putExtra("menu", "steamedshank");
			break;
		case R.id.steamedmonkfish:
			init.putExtra("menu", "steamedmonkfish");
			break;
		}
		startActivity(init);
	}
}
