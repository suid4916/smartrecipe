package com.example.smartrecipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewSoup extends Activity implements OnClickListener {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewsoup);
		Button beansproutssoup = (Button) findViewById(R.id.beansproutssoup);
		beansproutssoup.setOnClickListener(this);
		Button pollacksoup = (Button) findViewById(R.id.pollacksoup);
		pollacksoup.setOnClickListener(this);
		Button prophetsoup = (Button) findViewById(R.id.prophetsoup);
		prophetsoup.setOnClickListener(this);
		Button measlysoup = (Button) findViewById(R.id.measlysoup);
		measlysoup.setOnClickListener(this);
		Button haejangsoup = (Button) findViewById(R.id.haejangsoup);
		haejangsoup.setOnClickListener(this);
		Button seaweedsoup = (Button) findViewById(R.id.seaweedsoup);
		seaweedsoup.setOnClickListener(this);
		Button misosoup = (Button) findViewById(R.id.misosoup);
		misosoup.setOnClickListener(this);
		Button radishsoup = (Button) findViewById(R.id.radishsoup);
		radishsoup.setOnClickListener(this);
		Button eggsoup = (Button) findViewById(R.id.eggsoup);
		eggsoup.setOnClickListener(this);
	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent init = new Intent(this, DynamicSoup.class);
		switch(arg0.getId()){
		case R.id.beansproutssoup:
			init.putExtra("menu", "beansproutssoup");
			break;
		case R.id.pollacksoup:
			init.putExtra("menu", "pollacksoup");
			break;
		case R.id.prophetsoup:
			init.putExtra("menu", "prophetsoup");
			break;
		case R.id.measlysoup:
			init.putExtra("menu", "measlysoup");
			break;
		case R.id.haejangsoup:
			init.putExtra("menu", "haejangsoup");
			break;
		case R.id.seaweedsoup:
			init.putExtra("menu", "seaweedsoup");
			break;
		case R.id.misosoup:
			init.putExtra("menu", "misosoup");
			break;
		case R.id.radishsoup:
			init.putExtra("menu", "radishsoup");
			break;
		case R.id.eggsoup:
			init.putExtra("menu", "eggsoup");
			break;
		}
		startActivity(init);
	}
}
