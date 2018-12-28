package com.example.smartrecipe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class RefrigerView extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.refriger);
		int time = 1;
		TableLayout tl = (TableLayout) findViewById(R.id.refriger);
		TableRow.LayoutParams params1;
		TableRow.LayoutParams params2;
		TextView item = new TextView(this);
		TextView date = new TextView(this);
		try {
			BufferedReader bufferReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(Environment
							.getExternalStorageDirectory().getAbsolutePath()
							+ "/test.txt"), "UTF8"));
			String str;
			ArrayList<String> arr = new ArrayList<String>();
			boolean swit = true;
			while (swit) {
				if ((str = bufferReader.readLine()) != null) {
					arr.add(str);
					swit = true;
				} else
					swit = false;
			}
			bufferReader.close();
			long now = System.currentTimeMillis();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd",Locale.KOREA);
			Date today = new Date(now);
			params1 = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT, 0.5f);
			params2 = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT, 1f);
			TableRow tr = new TableRow(this);
			item.setText("물품");
			item.setLayoutParams(params1);
			date.setText("유통기한");
			date.setLayoutParams(params2);
			item.setGravity(Gravity.CENTER_HORIZONTAL);
			date.setGravity(Gravity.CENTER_HORIZONTAL);
			tr.addView(item);
			tr.addView(date);
			tl.addView(tr);
			for (int i = 0; i < arr.size(); i += 2) {
				TextView tv1 = new TextView(this);
				TextView tv2 = new TextView(this);
				TextView tv3 = new TextView(this);
				TableRow tr2 = new TableRow(this);
				tv1.setText((CharSequence) arr.get(i));
				tv2.setText((CharSequence) arr.get(i + 1));
				tv3.setText((CharSequence)arr.get(i+1));
				tv1.setGravity(Gravity.CENTER_HORIZONTAL);
				tv1.setLayoutParams(params1);
				tv2.setGravity(Gravity.CENTER_HORIZONTAL);
				tv2.setLayoutParams(params2);
				tv3.setGravity(Gravity.CENTER_HORIZONTAL);
				tv3.setLayoutParams(params2);
				for(time=1;time<arr.size();time+=2){
					Date deadline = simple.parse((String)arr.get(time));
					if(today.after(deadline)){
						tv3.setTextColor(Color.RED);
					}
					else{
						tv2.setTextColor(Color.BLUE);
					}
				}
				tr2.addView(tv1);
				if(today.after(simple.parse((String)arr.get(i+1))))
					tr2.addView(tv3);
				else
					tr2.addView(tv2);
				tl.addView(tr2);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
