package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewRice extends Activity implements OnClickListener
{

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewrice);
		Button whiterice = (Button) findViewById(R.id.whiterice);
		whiterice.setOnClickListener(this);
		Button peasrice = (Button) findViewById(R.id.peasrice);
		peasrice.setOnClickListener(this);
		Button steamedrice = (Button) findViewById(R.id.steamedrice);
		steamedrice.setOnClickListener(this);
		Button chestnutrice = (Button) findViewById(R.id.chestnutrice);
		chestnutrice.setOnClickListener(this);
		Button potatorice = (Button) findViewById(R.id.potatorice);
		potatorice.setOnClickListener(this);
		Button sweetpotatorice = (Button) findViewById(R.id.sweetpotatorice);
		sweetpotatorice.setOnClickListener(this);
		Button mushroomrice = (Button) findViewById(R.id.mushroomrice);
		mushroomrice.setOnClickListener(this);
		Button gondeureice = (Button) findViewById(R.id.gondeurerice);
		gondeureice.setOnClickListener(this);
		Button beansproutrice = (Button) findViewById(R.id.beansproutrice);
		beansproutrice.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent init = new Intent(this, DynamicRice.class);
		switch(v.getId()){
		case R.id.whiterice:
			init.putExtra("menu", "whiterice");
			break;
		case R.id.peasrice:
			init.putExtra("menu", "peasrice");
			break;
		case R.id.steamedrice:
			init.putExtra("menu", "steamedrice");
			break;
		case R.id.chestnutrice:
			init.putExtra("menu", "chestnutrice");
			break;
		case R.id.potatorice:
			init.putExtra("menu", "potatorice");
			break;
		case R.id.sweetpotatorice:
			init.putExtra("menu", "sweetpotatorice");
			break;
		case R.id.mushroomrice:
			init.putExtra("menu", "mushroomrice");
			break;
		case R.id.gondeurerice:
			init.putExtra("menu", "gondeurerice");
			break;
		case R.id.beansproutrice:
			init.putExtra("menu", "beansproutrice");
			break;
		}
		startActivity(init);
	}
}
