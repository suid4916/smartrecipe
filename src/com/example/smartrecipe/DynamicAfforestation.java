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

public class DynamicAfforestation extends Activity
{
	ImageView iv;
	LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(300, 300);
	TextView[] tv = new TextView[10];
	ArrayList<String> arr;
	String result;
	LinearLayout image;
	LinearLayout howto;
	LinearLayout title;
	LinearLayout list;

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dynamicmenu);
		image = (LinearLayout) findViewById(R.id.image);
		howto = (LinearLayout) findViewById(R.id.howto);
		title = (LinearLayout) findViewById(R.id.title);
		list = (LinearLayout) findViewById(R.id.list);
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
		if (result.equals("jangjorim"))
		{
			jangjorim();
		}
		else if (result.equals("croaker"))
		{
			croaker();
		}
		else if (result.equals("pollack"))
		{
			pollack();
		}
		else if (result.equals("tofu"))
		{
			tofu();
		}
		else if (result.equals("potato"))
		{
			potato();
		}
		else if (result.equals("chicken"))
		{
			chicken();
		}
		else if (result.equals("pork"))
		{
			pork();
		}
		else if (result.equals("chili"))
		{
			chili();
		}
		else if (result.equals("pheasant"))
		{
			pheasant();
		}
	}

	private void pheasant()
	{
		tv[0].setText("생치조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pheasant);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("생치"))
			{
				tv[1].setText("생치");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("생치");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 꿩은 배를 갈라 내장을 말끔히 손질한 뒤 흐르는 물에 씻어 잘게 토막낸다.");
		tv[3].setText("2. 파는 채 썰어 분량의 양념을 넣고 양념장을 만든다.");
		tv[4].setText("3. 손질한 꿩을 양념에 섞어 두꺼운 냄비에 넣어 중불에서 서서히 조린다. 조릴 때 간장이 자작하게 있도록 조린다. 너무 바싹 조리지 않는다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}

	private void chili()
	{
		tv[0].setText("풋고추조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.chili);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("풋고추"))
			{
				tv[1].setText("풋고추");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("풋고추");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 고추는 깨끗이 씻어 꼭지를 따고 포크로 양념이 잘 베이도록 구멍을 뚫어 준비한다.");
		tv[3].setText("2. 간장, 청주, 물엿, 깨, 물을 섞어 조림장을 준비한다.");
		tv[4].setText("3. 식용유 1큰술을 두른 팬에서 고추를 살짝 볶는다.");
		tv[5].setText("4. 고추가 살짝 볶아지면 간장, 청주, 물엿, 깨, 물을 넣어 중간중간 끼얹어가며 국물이 자작해지도록 조린 후 참기름을 뿌려 완성한다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void pork()
	{
		tv[0].setText("제육조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pork);
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
		tv[2].setText("1. 돼지고기를 토막 내어 갖은 양념에 버무린다.");
		tv[3].setText("2. 찬 물에 계란 1개를 넣고 15분간 삶아 껍질을 벗긴다.");
		tv[4].setText("3. 냄비에 물 1과 1/3컵에 간장 1과 1/2큰술을 넣고 끓으면 토막친 돼기고기를 넣고 중불로 30분 조린 다음 ②의 계란을 넣고 20분 더 조린다.");
		tv[5].setText("4. ③이 식으면 돼지고기를 건져 찢어서 접시에 담고 계란은 세로로 6등분하여 위에 올리고 ③국물을 붓는다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void chicken()
	{
		tv[0].setText("닭고기조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.chicken);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("땅콩"))
			{
				tv[1].setText("땅콩");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("땅콩");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("닭가슴살"))
			{
				tv[2].setText("닭가슴살");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("닭가슴살");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 닭가슴살은 곱게 다지고, 견과류도 다진다.");
		tv[4].setText("2. 브로콜리는 송이송이 자르고, 마늘은 편으로 썬다.");
		tv[5].setText("3. 당근, 피망, 양파도 다진다.");
		tv[6].setText("4. 볼에 닭가슴살과 닭고기 양념, 견과류, 그리고 3의 재료를 넣어 고루 섞은 후 먹기 좋은 크기로 동글동글하게 모양을 빚는다.");
		tv[7].setText("5. 냄비에 4를 넣고 마늘과 양념장을 넣어 조린다. 양념장이 거의 졸아들면 브로콜리를 넣어 같이 조리다 불을 끈다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void potato()
	{
		tv[0].setText("감자조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.potato);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("감자"))
			{
				tv[1].setText("감자");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("감자");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 감자, 당근, 양파는 깍둑썰기(사방 2cm)한다.");
		tv[3].setText("2. 간장, 설탕, 물엿, 마늘, 식용유, 물을 냄비에 넣고 불에 올려 끓여 양념장을 만든 후 감자를 먼저 넣고 조린다.");
		tv[4].setText("3. 감자가 반쯤 익었을 때 양파와 당근을 넣어 조린다.");
		tv[5].setText("4. 마지막에 깨를 뿌린다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void tofu()
	{
		tv[0].setText("두부조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.tofu);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("두부"))
			{
				tv[1].setText("두부");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("두부");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 두부는 가로 3.5cm, 세로 4.5cm, 두께 0.8cm로 네모지게 썰어 소금을 뿌린 후 마른 행주로 물기를 없앤다.");
		tv[3].setText("2. 팬에 식용유를 두르고 뜨거워지면 두부를 노릇노릇하게 지진다.");
		tv[4].setText("3. 간장, 파, 마늘, 깨소금, 고추, 설탕으로 양념장을 만든다.");
		tv[5].setText("4. 냄비에 두부를 넣고 양념장을 골고루 바른 후 물을 붓고 간이 들게 조려낸다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void pollack()
	{
		tv[0].setText("복어조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pollack);
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
		tv[2].setText("1. 북어는 적당한 크기로 썰어 준비한다.");
		tv[3].setText("2. 간장, 설탕, 다진 파, 다진 마늘, 물을 섞어 양념장을 만든다.");
		tv[4].setText("3. 냄비에 손질한 북어와 양념장을 넣고 졸인다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void croaker()
	{
		tv[0].setText("조기조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.croaker);
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
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("쑥갓"))
			{
				tv[2].setText("쑥갓");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("쑥갓");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 조기는 지느러미는 다 떼고 어슷하게 2~3토막을 낸다.");
		tv[4].setText("2. 실파는 4cm 길이로 썰고, 마늘을 얇게 져머서 썰고, 생강은 얇게 편 썰기(0.2~0.3cm)한다.");
		tv[5].setText("3. 분량의 양념을 모두 섞고 팬에 생선을 한 켜 담고 준비한 양념을 부어 가며 생선을 조린다.");
		tv[6].setText("4. 중간 정도의 불에 얹어 15~20분이면 적당하며, 거의 꺼낼 무렵에 쑥갓을 위에 얹고 다시 한 번 끓인다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void jangjorim()
	{
		tv[0].setText("장조림");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.jangjorim);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("쇠고기"))
			{
				tv[1].setText("쇠고기");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("쇠고기");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 쇠고기는 기름기를 제거하여 물에 담가 핏물을 뺀 다음 결대로 6∼7㎝ 통으로 썬 후 설탕을 뿌려 둔다.");
		tv[3].setText("2. 냄비에 참기름을 두르고 덩어리 고기를 볶다가 고기가 잠길 만큼의 물을 붓고 30분정도 삶는다.");
		tv[4].setText("3. 조림장을 혼합하여 2의 고기 냄비에 넣고 처음에는 센불에서 끓이다가 은근한 불로 졸인다.");
		tv[5].setText("4. 국물이 자작하게 졸고 고기에 간장색이 진하게 들면 고기를 건져내어 결대로 찢고 먹을 때마다 참기름을 한방울 정도 떨어뜨려 그릇에 담는다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}
}
