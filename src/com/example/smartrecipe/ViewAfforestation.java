package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewAfforestation extends Activity implements OnClickListener
{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewafforestation);
		Button jangjorim = (Button) findViewById(R.id.jangjorim);
		jangjorim.setOnClickListener(this);
		Button croaker = (Button) findViewById(R.id.croaker);
		croaker.setOnClickListener(this);
		Button pollack = (Button) findViewById(R.id.pollack);
		pollack.setOnClickListener(this);
		Button tofu = (Button) findViewById(R.id.tofu);
		tofu.setOnClickListener(this);
		Button potato = (Button) findViewById(R.id.potato);
		potato.setOnClickListener(this);
		Button chicken = (Button) findViewById(R.id.chicken);
		chicken.setOnClickListener(this);
		Button pork = (Button) findViewById(R.id.pork);
		pork.setOnClickListener(this);
		Button chili = (Button) findViewById(R.id.chili);
		chili.setOnClickListener(this);
		Button pheasant = (Button) findViewById(R.id.pheasant);
		pheasant.setOnClickListener(this);
	}
	@Override
	public void onClick(View v)
	{
		Intent init = new Intent(this,DynamicAfforestation.class);
		switch(v.getId()){
		case R.id.jangjorim:
			init.putExtra("menu", "jangjorim");
			break;
		case R.id.croaker:
			init.putExtra("menu", "croaker");
			break;
		case R.id.pollack:
			init.putExtra("menu", "pollack");
			break;
		case R.id.tofu:
			init.putExtra("menu", "tofu");
			break;
		case R.id.potato:
			init.putExtra("menu", "potato");
			break;
		case R.id.chicken:
			init.putExtra("menu", "chicken");
			break;
		case R.id.pork:
			init.putExtra("menu", "pork");
			break;
		case R.id.chili:
			init.putExtra("menu", "chili");
			break;
		case R.id.pheasant:
			init.putExtra("menu", "pheasant");
			break;
		}
		startActivity(init);
	}

}
