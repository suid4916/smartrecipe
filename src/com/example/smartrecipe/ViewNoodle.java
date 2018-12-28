package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewNoodle extends Activity implements OnClickListener
{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewnoodle);
		Button nanegmyeon = (Button) findViewById(R.id.naengmyeon);
		nanegmyeon.setOnClickListener(this);
		Button udon = (Button) findViewById(R.id.udon);
		udon.setOnClickListener(this);
		Button noodle = (Button) findViewById(R.id.noodle);
		noodle.setOnClickListener(this);
		Button pasta = (Button) findViewById(R.id.pasta);
		pasta.setOnClickListener(this);
		Button mixture = (Button) findViewById(R.id.mixture);
		mixture.setOnClickListener(this);
		Button jajangmyeon = (Button) findViewById(R.id.jajangmyeon);
		jajangmyeon.setOnClickListener(this);
		Button sujebi = (Button) findViewById(R.id.sujebi);
		sujebi.setOnClickListener(this);
		Button soba = (Button) findViewById(R.id.soba);
		soba.setOnClickListener(this);
		Button ramen = (Button) findViewById(R.id.ramen);
		ramen.setOnClickListener(this);
	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent init = new Intent(this, DynamicNoodle.class);
		switch(arg0.getId()){
		case R.id.naengmyeon:
			init.putExtra("menu", "naengmyeon");
			break;
		case R.id.udon:
			init.putExtra("menu", "udon");
			break;
		case R.id.noodle:
			init.putExtra("menu", "noodle");
			break;
		case R.id.pasta:
			init.putExtra("menu", "pasta");
			break;
		case R.id.mixture:
			init.putExtra("menu", "mixture");
			break;
		case R.id.jajangmyeon:
			init.putExtra("menu", "jajangmyeon");
			break;
		case R.id.sujebi:
			init.putExtra("menu", "sujebi");
			break;
		case R.id.soba:
			init.putExtra("menu", "soba");
			break;
		case R.id.ramen:
			init.putExtra("menu", "ramen");
			break;
			}
		startActivity(init);
	}
}
