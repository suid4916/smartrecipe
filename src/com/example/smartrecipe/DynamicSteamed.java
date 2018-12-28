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

public class DynamicSteamed extends Activity
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
		if (result.equals("steamedegg"))
		{
			steamedegg();
		}
		else if (result.equals("steamedpork"))
		{
			steamedpork();
		}
		else if (result.equals("steamedchicken"))
		{
			steamedchicken();
		}
		else if (result.equals("steamedpollack"))
		{
			steamedpollack();
		}
		else if (result.equals("steamedsquirt"))
		{
			steamedsquirt();
		}
		else if (result.equals("steamedwing"))
		{
			steamedwing();
		}
		else if (result.equals("steamedperilla"))
		{
			steamedperilla();
		}
		else if (result.equals("steamedshank"))
		{
			steamedshank();
		}
		else if (result.equals("steamedmonkfish"))
		{
			steamedmonkfish();
		}
	}

	private void steamedmonkfish()
	{
		tv[0].setText("아귀찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedmonkfish);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("아귀"))
			{
				tv[1].setText("아귀");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("아귀");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("콩나물"))
			{
				tv[2].setText("콩나물");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("콩나물");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("미더덕"))
			{
				tv[3].setText("미더덕");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("미더덕");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 아귀는 적당한 크기로 썰어 씻어둔다.");
		tv[5].setText("2. 된장을 약간 푼 물에 아귀를 넣고 살짝 데친 다음 채반에서 하루 정도 말린다.");
		tv[6].setText("3. 미나리는 6cm 길이로 썰어두고 대파도 어슷썰어 둔다.");
		tv[7].setText("4. 미더덕도 씻어서 물기를 빼 준비한다.");
		tv[8].setText("5. 멸치국물을 붓고 말린 아귀와 양념장을 넣고 중불에서 볶아준다.");
		tv[9].setText("6. 아귀가 적당하게 익으면 손질한 콩나물을 넣고 뚜껑을 덮고 익힌다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
		TextView tv = new TextView(this);
		tv.setText("7. 콩나물이 숨이 죽으면 미더덕을 넣고 양념과 고루 섞어준다.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("8. 녹말물을 풀어 걸죽하게 한 다음 미나리와 대파, 깨, 참기름을 약간 넣고 간은 소금으로 한다.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}

	private void steamedshank()
	{
		tv[0].setText("사태찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedshank);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("사태"))
			{
				tv[1].setText("사태");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("사태");
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
			if (arr.get(i).equals("당근"))
			{
				tv[3].setText("당근");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("당근");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 사태를 물에 담가 피를 빼고 깨끗이 씻는다.");
		tv[5].setText("2. 냄비에 물을 자작하게 붓고, 사태와 함께 큼직하게 썬 양파를 넣은 다음 잠깐 동안 삶는다. 끓으면 거품을 제거한다.");
		tv[6].setText("3. 삶은 사태는 건져서 4㎝ 크기로 썰어 배즙과 양념을 넣어 고르게 버무리고, 국물은 식혀서 기름기를 걷어 낸다.");
		tv[7].setText("4. 표고버섯은 손질하여 4등분하고, 당근은 썰어 모서리를 깎아 밤톨만하게 만든다.");
		tv[8].setText("5. 끓는 물에 약간의 소금을 넣고 은행을 넣어 국자로 으깨 가면서 껍질을 벗긴다. 밤은 껍질을 까서 준비한다.");
		tv[9].setText("6. 모든 재료를 섞어 기름기를 걷어낸 맑은 국물을 가만히 부어 끓인다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
	}

	private void steamedperilla()
	{
		tv[0].setText("깻잎찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedperilla);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("깻잎"))
			{
				tv[1].setText("깻잎");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("깻잎");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 깻잎은 깨끗이 씻어 물기를 뺀다.");
		tv[3].setText("2. 분량의 재료로 양념장을 만든다.");
		tv[4].setText("3. 깻잎에 양념장을 켜켜이 얹어 찐다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}

	private void steamedwing()
	{
		tv[0].setText("닭날개찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedwing);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("닭날개"))
			{
				tv[1].setText("닭날개");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("닭날개");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("마늘"))
			{
				tv[2].setText("마늘");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("마늘");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 닭날개는 씻어서 물기를 닦고 칼집을 서너 번 넣어 주고 소금과 후춧가루로 버무려 밑간한다.");
		tv[4].setText("2. 마늘은 중간 크기의 마늘로 준비해서 껍질을 벗기고 2등분한다.");
		tv[5].setText("3. 양파와 청ㆍ홍피망은 사방 2㎝ 크기로 자른다.");
		tv[6].setText("4. 팬에 기름을 두르고 마늘을 넣어 노릇하게 볶은 후 생강채와 닭날개를 넣고 볶다가 청주와 간장을 넣어 버무리고 다시마 우린 물을 뿌려서 뚜껑을 덮어 닭날개 속까지 익도록 약한 불에서 찐다.");
		tv[7].setText("5. 닭날개가 속까지 익으면 자른 양파, 청ㆍ홍피망을 넣고 볶아 소금, 후춧가루로 간을 맞춘다.");
		tv[8].setText("6. ⑤에 물녹말을 약간 부어서 걸쭉한 농도가 되면 참기름을 뿌려 버무려 상에 낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}

	private void steamedsquirt()
	{
		tv[0].setText("미더덕찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedsquirt);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("미더덕"))
			{
				tv[1].setText("미더덕");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("미더덕");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("콩나물"))
			{
				tv[2].setText("콩나물");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("콩나물");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("미나리"))
			{
				tv[3].setText("미나리");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("미나리");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 미더덕은 소금물에 씻어 건져둔다.");
		tv[5].setText("2. 미나리, 대파는 5cm 길이로 썬다. 양파는 5mm 두께로 썰고, 깻잎은 4등분으로 자르고 새송이는 반으로 잘라 굵게 채친다.");
		tv[6].setText("3. 육수를 끓여 체에 한번 걸러서 둔다.");
		tv[7].setText("4. ① 볼에 양념장 재료를 모두 넣고 잘 섞는다.\n ② 냄비에 3의 육수를 붓고 미더덕과 4의 양념장을 넣고 끓인다.\n ③ 끓으면 물에 푼 찹쌀가루를 넣어 농도를 맞춘다.\n ④ 콩나물, 대파, 미나리, 양파, 깻잎, 새송이를 넣고 한소끔 끓이고 마지막에 소금으로 간을 맞춘다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void steamedpollack()
	{
		tv[0].setText("북어찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedpollack);
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
		tv[2].setText("1. 북어(코다리)는 물에 담구어 불려서 머리와 지느러미, 꼬리를 제거하고 반으로 펴서 뼈를 발라낸다");
		tv[3].setText("2. 6㎝ 정도의 크기로 3토막을 낸 다음 껍질쪽에 잔 칼집을 넣어 오그라들지 않게 한다.");
		tv[4].setText("3. 파의 ½은 1㎝ 길이로 잘라 곱게 채썰고, ½은 흰 뿌리 부분만 곱게 다져 분량의 간장, 설탕, 물, 깨소금, 참기름, 후춧가루, 다진 마늘·생강으로 양념장을 만든다.");
		tv[5].setText("4. 냄비에 손질한 북어(코다리)를 담고 양념장을 끼얹어가며 약한 불에서 천천히 끊인다.");
		tv[6].setText("5. 북어(코다리)가 잘 무르익으면 실고추, 파채를 얹고 잠시 뜸을 들여서 국물과 함께 그릇에 담아낸다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void steamedchicken()
	{
		tv[0].setText("찜닭");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedchicken);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("닭고기"))
			{
				tv[1].setText("닭고기");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("닭고기");
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
			if (arr.get(i).equals("감자"))
			{
				tv[3].setText("감자");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("감자");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("당면"))
			{
				tv[4].setText("당면");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("당면");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 우유에 닭을 20분가량 담근 후 헹궈 소금, 후추, 청주로 밑간한다.");
		tv[6].setText("2. 대파는 어슷 썰기, 감자와 양파는 깍둑썰기 해둔다. 홍고추는 통으로 쓰거나 반으로 잘라 쓴다.");
		tv[7].setText("3. 달궈진 팬에 참기름을 두르고 밑간한 닭을 겉만 살짝 볶아준다.");
		tv[8].setText("4. 살짝 볶은 닭에 콜라를 부어 한소끔 끓인다.");
		tv[9].setText("5. 굴소스, 캐러멜소스, 당면, 청주를 제외한 모든 재료를 넣고 끓여준다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
		TextView tv = new TextView(this);
		tv.setText("6. 한소끔 끓인 후 굴소스, 캐러멜소스를 넣고 국물이 거의 다 없어질 때까지 졸인다.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("7. 청주를 넣고 물에 불려둔 당면을 넣어 1분만 뚜껑을 닫고 익힌다.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}

	private void steamedpork()
	{
		tv[0].setText("돼지고기김치찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedpork);
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
			if (arr.get(i).equals("배추김치"))
			{
				tv[2].setText("배추김치");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("배추김치");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 돼지고기는 목살로 준비해서 먹기 좋은 크기로 삼각형 모양으로 썬다.");
		tv[4].setText("2. ①의 돼지고기에 고추기름, 설탕, 다진 파, 다진 마늘, 후춧가루, 생강즙, 소금을 넣고 조물조물 무쳐 재운다.");
		tv[5].setText("3. 배추김치는 국물이 있는 채로 통째로 준비한다. 대파는 4㎝ 길이로 토막내어 세로로 반을 가른다.");
		tv[6].setText("4. 냄비에 양념한 돼지고기를 넣고 볶다가 김치와 대파를 올리고 쌀뜨물을 부어 찐다.");
		tv[7].setText("5. 김치가 무르게 익고 돼지고기의 맛이 퍼지면 소금으로 간을 해서 한소끔 더 끓여 국물이 처음의 ⅓정도가 되면 불에서 내린다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void steamedegg()
	{
		tv[0].setText("계란찜");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedegg);
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
			if (arr.get(i).equals("다시마"))
			{
				tv[2].setText("다시마");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("다시마");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 다시마는 젖은 면 보로 닦은 뒤 찬물에 넣고 서서히 끓인 뒤 다시마는 건져냅니다.");
		tv[4].setText("2. 계란 4개에 소금을 넣고 7~8분 정도 둔 뒤 숟가락으로 알 끈을 끊어가며 저은 뒤 체에 한번 거릅니다.");
		tv[5].setText("3. 계란에 다시마 물 2컵 넣어 섞은 뒤 찜 그릇에 담고 면 보나 랩으로 덮어 감쌉니다.");
		tv[6].setText("4. 찜 냄비에 찜 그릇이 반쯤 잠길 정도만 물을 붓고 물이 끓으면 찜 그릇을 넣어 중간 불에서 20분 정도 중탕으로 찝니다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}
}
