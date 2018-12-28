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

public class DynamicSoup extends Activity
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
		if (result.equals("beansproutssoup"))
		{
			beansproutssoup();
		}
		else if (result.equals("pollacksoup"))
		{
			pollacksoup();
		}
		else if (result.equals("prophetsoup"))
		{
			prophetsoup();
		}
		else if (result.equals("measlysoup"))
		{
			measlysoup();
		}
		else if (result.equals("haejangsoup"))
		{
			haejangsoup();
		}
		else if (result.equals("seaweedsoup"))
		{
			seaweedsoup();
		}
		else if (result.equals("misosoup"))
		{
			misosoup();
		}
		else if (result.equals("radishsoup"))
		{
			radishsoup();
		}
		else if (result.equals("eggsoup"))
		{
			eggsoup();
		}
	}

	private void eggsoup()
	{
		tv[0].setText("맑은무국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.eggsoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("계란"))
			{
				tv[1].setText("계란");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("계란");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("실파"))
			{
				tv[2].setText("실파");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("실파");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("멸치"))
			{
				tv[3].setText("멸치");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("멸치");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 끓는 물에 멸치를 넣고 국물을 우려낸다.");
		tv[5].setText("2. 계란, 소금을 넣고 고루 섞이도록 저어준다.");
		tv[6].setText("3. 냄비에 멸치를 건저내고 풀어 놓은 계란을 넣는다.");
		tv[7].setText("4. 실파를 넣고 소금, 후춧가루를 넣고 간을 한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void radishsoup()
	{
		tv[0].setText("맑은무국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.misosoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("무"))
			{
				tv[1].setText("무");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("무");
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
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("마늘"))
			{
				tv[3].setText("마늘");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("마늘");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 무는 사방 2.5㎝ 크기로 납작하게 썰어 소금물에 헹궈 건져 물기를 뺀다.");
		tv[5].setText("2. 냄비에 국간장과 들기름, 다진 마늘을 넣어 볶다가 무와 생강즙을 넣어 무가 투명해지도록 볶는다.");
		tv[6].setText("3. ②에 쌀뜨물을 붓고 끓여 무가 살캉하게 익으면서 국물이 우러나면 대파를 굵게 채 썰어 넣고 들깻가루를 넣어 끓인다.");
		tv[7].setText("4. 소금으로 간을 해서 완성한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void misosoup()
	{
		tv[0].setText("된장국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.misosoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("된장국"))
			{
				tv[1].setText("된장국");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("된장국");
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
			if (arr.get(i).equals("달래"))
			{
				tv[3].setText("달래");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("달래");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 달래는 깨끗이 씻어 4cm 길이로 자른다.");
		tv[5].setText("2. 두부는 2cm 정도로 썰어둔다. 고추는 씻어 송송 썬다.");
		tv[6].setText("3. 냄비에 물을 붓고 된장을 푼 다음 국물을 끓인다.");
		tv[7].setText("4. 끓는 된장국에 달래와 두부를 넣고 끓인다.");
		tv[8].setText("4. 끓으면 고추, 고추가루, 다진 마늘을 넣어 한 번 더 끓여 낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}

	private void seaweedsoup()
	{
		tv[0].setText("미역국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.seaweedow);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("미역"))
			{
				tv[1].setText("미역");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("미역");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("소고기"))
			{
				tv[2].setText("소고기");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("소고기");
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
		tv[4].setText("1. 마른 미역은 물에 불린 후 적당히 썰고 재래간장을 약간 넣어 무쳐 둔다.");
		tv[5].setText("2. 쇠고기는 잘게 썰어 냄비에 참기름과 다진 마늘을 넣고 볶는다. 고기가 어느 정도 익으면 썰어 놓은 미역을 넣고 같이 볶는다.");
		tv[6].setText("3. 쇠고기와 미역을 볶은 냄비에 물을 부은 후 오랫동안 끓인다.");
		tv[7].setText("4. 마지막에 재래간장과 소금으로 간을 하여 낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void haejangsoup()
	{
		tv[0].setText("해장국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.haejangsoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("황태포"))
			{
				tv[1].setText("황태포");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("황태포");
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
			if (arr.get(i).equals("콩나물"))
			{
				tv[3].setText("콩나물");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("콩나물");
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
			if (arr.get(i).equals("달걀"))
			{
				tv[5].setText("달걀");
				tv[5].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[5].setText("달걀");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 황태포는 적당하게 찢어서 물에 잠시 담궜다가 살짝 물기를 뺀다.");
		tv[7].setText("2. 무는 나박썰고, 두부는 깍둑썰고 실파는 4cm 길이로 썰어둔다. 콩나물도 손질해 씻어 물기를 빼고 준비한다.");
		tv[8].setText("3. 팬에 들기름을 두르고 먼저 황태를 넣고 약한 불에 달달 볶아준다.(들기름은 센 불에 조리하면 쉽게 타므로 약한 불에 볶아준다.)");
		tv[9].setText("4. 들기름을 황태가 거의 흡수하면 물을 붓고 무를 넣고 끓여준다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
		TextView tv = new TextView(this);
		tv.setText("5. 무가 투명하게 익으면, 콩나물을 넣고 끓여준다.(뚜껑을 덮지 말고 열고 끓인다.)");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("6. 콩나물이 익으면 두부를 넣고 달걀을 실파에 풀어서 넣고 마늘과 소금으로 간하고 마무리한다.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}

	private void measlysoup()
	{
		tv[0].setText("순댓국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.measlysoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("순대"))
			{
				tv[1].setText("순대");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("순대");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("사골육수"))
			{
				tv[2].setText("사골육수");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("사골육수");
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
		tv[4].setText("1. 사골육수를 뚝배기에 올리고 끓여준다.");
		tv[5].setText("2. 고춧가루, 표고버섯가루, 재래간장, 마늘, 생강즙, 후춧가루, 양파즙을 넣어 양념장을 미리 만들어 둔다.");
		tv[6].setText("3. 사골육수가 끓어 오르면 순대와 내장을 넣고 끓여서, 들깻가루, 대파를 올려 낸다.");
		tv[7].setText("4. 콩양념장이나 새우젓을 함께 곁들인다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void prophetsoup()
	{
		tv[0].setText("선지국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.prophetsoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("선지"))
			{
				tv[1].setText("선지");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("선지");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("우거지"))
			{
				tv[2].setText("우거지");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("우거지");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("사골"))
			{
				tv[3].setText("사골");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("사골");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("콩나물"))
			{
				tv[4].setText("콩나물");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("콩나물");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 사골은 찬물에 담가 핏물을 뺀 다음 물을 많이 붓고 센 불에서 끓이다가 중간에 마늘과 15cm 정도로 길게 썬 파를 넣는다. 끓기 시작하면 불을 줄여서 6시간 이상 푹 끓인다.");
		tv[6].setText("2. 육수의 맛이 충분히 우러나면 뼈는 건져 내고 된장을 풀어서 끓인다.");
		tv[7].setText("3. 선지는 끓는 물에 소금을 약간 넣고 한 국자씩 떠 넣어 삶아서 찬물에 담가 둔다.");
		tv[8].setText("4. 콩나물은 뿌리를 다듬어 씻고 배추나 무청 우거지는 끓는 물에 데쳐서 송송 썰어(0.5cm) 고추장과 다진 마늘을 넣은 다음 살짝 주물러서 끓는 된장국에 넣는다.");
		tv[9].setText("5. 한소끔 끓으면 삶은 선지를 한 데 끓여서 재래간장으로 간을 맞춘다.");
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

	private void pollacksoup()
	{
		tv[0].setText("북어국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pollacksoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("북어"))
			{
				tv[1].setText("북어");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("북어");
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
			if (arr.get(i).equals("계란"))
			{
				tv[3].setText("계란");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("계란");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("멸치"))
			{
				tv[4].setText("멸치");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("멸치");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 북어포는 잘게 찢어 물에 불린다.");
		tv[6].setText("2. 냄비에 불린 북어를 넣고 참기름에 볶다가 무를 넣고 같이 볶는다.");
		tv[7].setText("3. 냄비에 물을 넣고 끓인다.");
		tv[8].setText("4. 달걀을 풀고 어슷썬 대파, 다진 마늘을 넣는다.");
		tv[9].setText("5. 소금으로 간하고 후추를 넣는다.");
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

	private void beansproutssoup()
	{
		tv[0].setText("콩나물국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beansproutssoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("콩나물"))
			{
				tv[1].setText("콩나물");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("콩나물");
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
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("다시마"))
			{
				tv[3].setText("다시마");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("다시마");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("멸치"))
			{
				tv[4].setText("멸치");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("멸치");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 콩나물은 흐르는 물에 씻어 건진다.");
		tv[6].setText("2. 냄비에 물을 붓고 다시마, 멸치, 새우를 넣어 끓이다가 모두 건져낸다.");
		tv[7].setText("3. 콩나물을 넣고 뚜껑을 덮어 좀 더 끓이다가 끓어오르면 불을 줄여 10분가량 더 끓인다.");
		tv[8].setText("4. 콩나물국에 다진 마늘과 송송 썬 파를 넣고 소금으로 간한 다음 한소끔 끓인 후 불을 끈다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
}
