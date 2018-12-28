package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewRecipe extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewmenu);
		Button rice = (Button) findViewById(R.id.rice);
		rice.setOnClickListener(this);
		Button stew = (Button) findViewById(R.id.stew);
		stew.setOnClickListener(this);
		Button soup = (Button) findViewById(R.id.soup);
		soup.setOnClickListener(this);
		Button noodle = (Button) findViewById(R.id.Noodle);
		noodle.setOnClickListener(this);
		Button pots = (Button) findViewById(R.id.Pots);
		pots.setOnClickListener(this);
		Button roast = (Button) findViewById(R.id.Roast);
		roast.setOnClickListener(this);
		Button steam = (Button) findViewById(R.id.Streamed);
		steam.setOnClickListener(this);
		Button Afforestation = (Button)findViewById(R.id.Afforestation);
		Afforestation.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
		case R.id.rice:
			Intent init = new Intent(this,ViewRice.class);
			startActivity(init);
			break;
		case R.id.stew:
			Intent inten = new Intent(this,ViewStew.class);
			startActivity(inten);
			break;
		case R.id.soup:
			Intent inten1 = new Intent(this,ViewSoup.class);
			startActivity(inten1);
			break;
		case R.id.Noodle:
			Intent inten2 = new Intent(this,ViewNoodle.class);
			startActivity(inten2);
			break;
		case R.id.Pots:
			Intent inten3 = new Intent(this,ViewPots.class);
			startActivity(inten3);
			break;
		case R.id.Roast:
			Intent inten4 = new Intent(this,ViewRoast.class);
			startActivity(inten4);
			break;
		case R.id.Streamed:
			Intent inten5 = new Intent(this,ViewSteamed.class);
			startActivity(inten5);
			break;
		case R.id.Afforestation:
			Intent inten6 = new Intent(this,ViewAfforestation.class);
			startActivity(inten6);
			break;
		}
	}
}
