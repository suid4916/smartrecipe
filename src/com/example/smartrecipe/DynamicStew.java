package com.example.smartrecipe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicStew extends Activity
{
	ImageView iv;
	LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(300, 300);
	TextView[] tv = new TextView[10];
	LinearLayout image;
	LinearLayout howto;
	LinearLayout title;
	LinearLayout list;
	ArrayList<String> arr;
	String result;

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dynamicmenu);
		image = (LinearLayout)findViewById(R.id.image);
		howto = (LinearLayout)findViewById(R.id.howto);
		title = (LinearLayout)findViewById(R.id.title);
		list = (LinearLayout)findViewById(R.id.list);
		iv = new ImageView(this);
		params.gravity = Gravity.CENTER_HORIZONTAL;
		iv.setLayoutParams(params);
		result = getIntent().getStringExtra("menu");
		for (int i = 0; i < tv.length; i++)
		{
			tv[i] = new TextView(this);
			tv[i].setGravity(Gravity.CENTER_HORIZONTAL);
		}
		params.gravity = Gravity.CENTER;
		iv.setLayoutParams(params);
		for (int i = 0; i < tv.length; i++)
		{
			tv[i] = new TextView(this);
			tv[i].setGravity(Gravity.CENTER_HORIZONTAL);
		}
		try
		{
			BufferedReader bufferReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(Environment
							.getExternalStorageDirectory().getAbsolutePath()
							+ "/test.txt"),"UTF8"));
			String str;
			boolean swit = true;
			arr = new ArrayList<String>();
			while (swit)
			{
				if ((str = bufferReader.readLine()) != null)
				{
					arr.add(str);
					swit = true;
				}
				else
					swit = false;
			}
			bufferReader.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		select();
	}

	public void select()
	{
		if (result.equals("kimchistew"))
		{
			kimchistew();
		}
		else if (result.equals("misostew"))
		{
			misostew();
		}
		else if (result.equals("tofustew"))
		{
			tofustew();
		}
		else if (result.equals("pumpkinstew"))
		{
			pumpkinstew();
		}
		else if (result.equals("horseradishstew"))
		{
			horseradishstew();
		}
		else if (result.equals("pollackstew"))
		{
			pollackstew();
		}
		else if (result.equals("squidstew"))
		{
			squidstew();
		}
		else if (result.equals("soybean"))
		{
			soybean();
		}
	}

	private void soybean()
	{
		tv[0].setText("청국장");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.soybean);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("소고기"))
			{
				tv[1].setText("소고기");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("소고기");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("청국장"))
			{
				tv[2].setText("청국장");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("청국장");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("두부"))
			{
				tv[3].setText("두부");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("두부");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("양파"))
			{
				tv[4].setText("양파");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("양파");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 쇠고기와 두부는 깍둑 모양으로 썹니다.");
		tv[6].setText("2. 양파는 잘게 다지고 대파, 청·홍 고추는 어슷하게 썹니다. 애호박은 반달모양으로 썰고 팽이버섯은 밑동을 제거해 손질합니다.");
		tv[7].setText("3. 쇠고기에 밑간 양념을 넣어 버무린 후 뚝배기에 쇠고기를 볶다 쌀뜨물을 넣고 끓으면 청국장을 풀어 넣습니다.");
		tv[8].setText("4. 두부, 양파, 대파, 애호박을 넣고 다진 마늘, 고춧가루, 소금을 넣어 간합니다.");
		tv[9].setText("5. 팽이 버섯, 고추를 넣고 한소끔 끓인 후 내립니다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
	}

	private void squidstew()
	{
		tv[0].setText("오징어김치찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.squidstew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("오징어"))
			{
				tv[1].setText("오징어");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("오징어");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("김치"))
			{
				tv[2].setText("김치");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("김치");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 냄비에 김치와 오징어를 넣고 강불에서 오징어가 살짝 익은 색이 날때까지 볶는다.");
		tv[4].setText("2. 오징어가 익으면 물을 넣고 강불에서 한번 끓인다.");
		tv[5].setText("3. 국간장과 소금으로 간을 맟춘후 강불에서 10분정도 더 끓인다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void pollackstew()
	{
		tv[0].setText("생태찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pollackstew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("생태"))
			{
				tv[1].setText("생태");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("생태");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("무"))
			{
				tv[2].setText("무");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("무");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("두부"))
			{
				tv[3].setText("두부");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("두부");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("모시조개"))
			{
				tv[4].setText("모시조개");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("모시조개");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 생태는 손질하여 4cm 간격으로 토막내어 놓는다.");
		tv[6].setText("2. 무는 0.5cm 두께로 가로세로 2cm 길이로 썰어 놓는다. 두부는 가로세로 2cm 길이 두께 0.8cm로 썰어 놓는다.");
		tv[7].setText("3. 무와 물을 넣고 끓이다가 무가 어느 정도 익으면 조개를 넣고 끓인다.");
		tv[8].setText("4. 소금간 후 두부와 쑥갓, 미나리를 넣고 완성한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}

	private void horseradishstew()
	{
		tv[0].setText("냉이된장찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.horseradishstew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("냉이"))
			{
				tv[1].setText("냉이");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("냉이");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("물"))
			{
				tv[2].setText("물");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("물");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 냉이는 누런 잎을 골라 다듬어 깨끗이 씻는다.");
		tv[4].setText("2. 끓는 물에 냉이를 살짝 데쳐 찬물에 헹군다.");
		tv[5].setText("3. 냄비에 물을 붓고 멸치를 넣어 국물을 우려낸 뒤 체에 밭친 된장과 고추장을 넣고 끓인다.");
		tv[6].setText("4. 국물이 끓을 때 데친 냉이와 어슷썬 대파를 넣고 좀더 끓이다가 소금으로 간을 맞춘다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void pumpkinstew()
	{
		tv[0].setText("김치호박찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.tofustew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("배추김치"))
			{
				tv[1].setText("배추김치");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("배추김치");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("늙은호박"))
			{
				tv[2].setText("늙은호박");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("늙은호박");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 배추김치는 먹기 좋은 크기로 썬다.");
		tv[4].setText("2. 호박은 껍질을 벗기고 납작하게 썬다.");
		tv[5].setText("3. 대파와 풋고추는 어슷하게 썬다.");
		tv[6].setText("4. 냄비에 배추김치와 물 6컵을 넣어 끓으면 늙은 호박을 넣고 푹 끓인다.");
		tv[7].setText("5. 다진 마늘과 새우젓을 넣어 간을 맞춘 후 대파와 풋고추를 넣는다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void tofustew()
	{
		tv[0].setText("순두부찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.tofustew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("순두부"))
			{
				tv[1].setText("순두부");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("순두부");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("돼지고기"))
			{
				tv[2].setText("돼지고기");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("돼지고기");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("배추김치"))
			{
				tv[3].setText("배추김치");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("배추김치");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("느타리버섯"))
			{
				tv[4].setText("느타리버섯");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("느타리버섯");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 돼지고기는 먹기 좋은 크기로 썰어 다진 마늘, 다진 생강, 소금을 넣어 양념한 후 팬에 참기름 1큰술을 두른 후 볶는다.");
		tv[6].setText("2. 1에 잘게 썬 김치를 넣어 같이 볶다가 물을 넣고 끓인다.");
		tv[7].setText("3. 국물이 끓어오르면 순두부를 넣고 다시 끓인다. 끓이는 도중에 느타리버섯, 대파, 풋고추, 홍고추를 넣는다.");
		tv[8].setText("4. 고춧가루, 다진 마늘을 넣어 한 번 더 끓이고 소금으로 간을 한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}

	private void misostew()
	{
		tv[0].setText("된장찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.misostew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("된장"))
			{
				tv[1].setText("된장");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("된장");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("명치"))
			{
				tv[2].setText("명치");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("명치");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("물"))
			{
				tv[3].setText("물");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("물");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("두부"))
			{
				tv[4].setText("두부");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("두부");
				tv[4].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("무"))
			{
				tv[5].setText("무");
				tv[5].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[5].setText("무");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 냄비에 물을 넣고 머리와 내장을 제거한 국멸치를 넣어 멸치국물을 우려낸 후 멸치는 건져낸다.");
		tv[7].setText("2. 멸치국물이 우러나면 채에 된장을 넣어 개어 주듯이 된장을 풀어주고 고춧가루를 넣어 끓인다.");
		tv[8].setText("3. 된장 푼 물이 끓어오르면 납작썰기한 무를 넣어 무가 익도록 끓여준다.");
		tv[9].setText("4. 무가 다 익으면 납작썰기한 호박, 두부, 송송 썬 청양고추, 팽이버섯, 다진 마늘, 송송 썬 대파를 넣어 한소끔 끓여 완성한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
	}

	private void kimchistew()
	{
		tv[0].setText("돈육김치찌개");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.kimchistew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i+=2)
		{
			if (arr.get(i).equals("배추김치"))
			{
				tv[1].setText("배추김치");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("배추김치");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("두부"))
			{
				tv[2].setText("두부");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("두부");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("돼지고기"))
			{
				tv[3].setText("돼지고기");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("돼지고기");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 김치와 돼지고기, 두부는 먹기좋은 크기로 자르고 파는 어슷썬다.");
		tv[5].setText("2. 냄비에 돼지고기를 넣고 볶다가 김치도 함께넣어 볶아준다.");
		tv[6].setText("3. 고기의 겉면이 익을 쯤 물과 다진마늘을 넣고 오래 끓여준다.");
		tv[7].setText("4. 소금으로 간하고 파를 넣은후 불을 끈다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
