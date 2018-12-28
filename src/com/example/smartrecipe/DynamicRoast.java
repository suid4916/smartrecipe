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

public class DynamicRoast extends Activity
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
							+ "/test.txt"), "UTF-8"));
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select();
	}

	public void select()
	{
		if (result.equals("skewers"))
		{
			skewers();
		}
		else if (result.equals("mackerelgrill"))
		{
			mackerelgrill();
		}
		else if (result.equals("shellfishgrill"))
		{
			shellfishgrill();
		}
		else if (result.equals("shadgrill"))
		{
			shadgrill();
		}
		else if (result.equals("croakergrill"))
		{
			croakergrill();
		}
		else if (result.equals("seriolagrill"))
		{
			seriolagrill();
		}
		else if (result.equals("beefgrill"))
		{
			beefgrill();
		}
		else if (result.equals("cuttlefishgrill"))
		{
			cuttlefishgrill();
		}
	}

	private void cuttlefishgrill()
	{
		tv[0].setText("오징어구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.cuttlefishgrill);
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
			if (arr.get(i).equals("대파"))
			{
				tv[2].setText("대파");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("대파");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 양념장 재료를 고루 섞어 구이 양념장을 만든다.");
		tv[4].setText("2. 오징어는 몸통을 반으로 갈라 내장을 빼고 껍질을 벗겨 씻은 다음 안쪽에 대각선으로 촘촘히 칼집을 넣은 후 양념장에 20분간 재워둔다.");
		tv[5].setText("3. 뜨겁게 달군 번철이나 석쇠에 양념장으로 재운 오징어를 굽다가 한입 크기로 자른다.");
		tv[6].setText("4. 곱게 채 썬 대파를 찬물에 담갔다가 물기를 없앤 후 곁들여 낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void beefgrill()
	{
		tv[0].setText("쇠고기구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beefgrill);
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
			if (arr.get(i).equals("양파"))
			{
				tv[2].setText("양파");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("양파");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("레드 와인"))
			{
				tv[3].setText("레드 와인");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("레드 와인");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 쇠고기는 2cm 길이의 정사각형으로 자른 후 레드 와인, 소금, 후춧가루, 바질을 넣어 30분 정도 재워둔다.");
		tv[5].setText("2. 양파, 피망은 세로로 자른 후 삼각형으로 큼직하게 자른다.");
		tv[6].setText("3. 팬에 버터를 녹인 후 마늘을 볶다가 양파를 볶는다.");
		tv[7].setText("4. 여기에 쇠고기를 넣어 볶으면서 양송이버섯, 가지, 피망, 브로콜리를 넣고 소금, 후춧가루로 간을 한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void seriolagrill()

	{
		tv[0].setText("방어구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.seriolagrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("방어"))
			{
				tv[1].setText("방어");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("방어");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("레몬"))
			{
				tv[2].setText("레몬");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("레몬");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 방어 소스(간장, 청주, 미린, 설탕)를 미리 만든다.");
		tv[4].setText("2. 방어를 먹기 좋게 썰어 기름을 약간 두른 프라이펜에 놓고 굽습니다.");
		tv[5].setText("3. 이제 준비해둔 소스를 넣어준 후 소스를 끼얹어 가며 조린다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void croakergrill()
	{
		tv[0].setText("조기구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.croakergrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("조기"))
			{
				tv[1].setText("조기");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("조기");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 조기는 비늘을 긁어내고 아가미 쪽으로 내장을 뺀 후 쌀뜨물에 담가 비린맛을 없애고 씻어 건진다. 조기의 등 쪽에 서너 번 정도 칼집을 넣는다.");
		tv[3].setText("2. 조기를 채반에 올리고 소금과 생강즙을 뿌려 잠시 밑간한다.");
		tv[4].setText("3. 오븐 팬에 식용유를 바르고 조기를 올린 후 180℃의 온도에서 구워 중간에 뒤집어 10분 정도 구워낸다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}

	private void shadgrill()
	{
		tv[0].setText("전어구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.shadgrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("전어"))
			{
				tv[1].setText("전어");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("전어");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 전어는 비늘을 벗기고 깨끗이 씻어 물기를 제거한다.");
		tv[3].setText("2. 손질한 전에 소금을 뿌린다.(칼집은 넣지 않는다.)");
		tv[4].setText("3. 석쇠에 전어를 올려 자주 뒤집어 주면서 노릇노릇하게 굽는다.");
		tv[5].setText("(석쇠를 달군 후 키친타월 등을 이용해 석쇠에 기름칠을 한번 해준 후 전어를 올려 구우면 석쇠에 전어가 달라붙지 않는다.)");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void shellfishgrill()
	{
		tv[0].setText("조개구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.shellfishgrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("바지락"))
			{
				tv[1].setText("바지락");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("바지락");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 바지락은 소금물에 담가 해감시킨 후 깨끗이 씻는다.");
		tv[3].setText("2. 레몬은 4등분 하여 썰고 초고추장을 분량대로 만든다.");
		tv[4].setText("3. 그릴에 바지락을 넣어 3분 동안 익힌 후 꺼낸다.");
		tv[5].setText("4. 바지락에 레몬을 곁들이고 초고추장을 찍어 먹는다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void mackerelgrill()
	{
		tv[0].setText("고등어구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mackerelgrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("고등어"))
			{
				tv[1].setText("고등어");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("고등어");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 고등어는 싱싱한 것으로 골라 내장과 아가미를 빼고 어슷하게 칼집을 깊이 넣는다.");
		tv[3].setText("2. 달라 붙지 않게 석쇠에 식초를 살짝 발라 중불에서 앞뒤로 서서히 구워 낸다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
	}

	private void skewers()
	{
		tv[0].setText("꼬치구이");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.skewers);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("돼지고기"))
			{
				tv[1].setText("돼지고기");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("돼지고기");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("바비큐 소스"))
			{
				tv[2].setText("바비큐 소스");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("바비큐 소스");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("닭고기"))
			{
				tv[3].setText("닭고기");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("닭고기");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 돼지고기에 소금, 후춧가루를 뿌려 깻잎으로 싼 후 꼬치에 꿰고 중간에 마늘을 꿴다.");
		tv[5].setText("2. 닭고기는 먹기 좋은 크기로 썰고 붉은 고추는 2cm 길이로 썰어서 꼬치에 꿴다.");
		tv[6].setText("3. 대파는 3cm 길이로 썰어 양송이버섯과 함께 꼬치에 꿴다. 낙지는 먹물을 빼고 통째로 꼬치에 돌돌 말아준다.");
		tv[7].setText("4. 달군 그릴 팬에 준비한 꼬치를 앞뒤로 살짝 익힌 후 분량의 바비큐 소스와 두반장을 섞어 2~3회 정도 덧발라 가며 앞뒤로 노릇하게 굽는다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
