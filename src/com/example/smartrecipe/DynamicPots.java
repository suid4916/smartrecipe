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

public class DynamicPots extends Activity
{
	ImageView iv;
	LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(300,300);
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
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new TextView(this);
			tv[i].setGravity(Gravity.CENTER_HORIZONTAL);
		}
		params.gravity = Gravity.CENTER;
		iv.setLayoutParams(params);		
		for(int i =0;i<tv.length;i++){
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
			boolean swit  = true;
			arr = new ArrayList<String>();
			while(swit){
				if((str=bufferReader.readLine())!=null){
					arr.add(str);
					swit = true;
				}else
					swit=false;
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
	public void select(){
		if(result.equals("beefpots")){
			beefpots();
		}else if(result.equals("seafoodpots")){
			seafoodpots();
		}else if(result.equals("doogolepots")){
			doogolepots();
		}else if(result.equals("gaegookpots")){
			gaegookpots();
		}else if(result.equals("mushroompots")){
			mushroompots();
		}else if(result.equals("fishcakepots")){
			fishcakepots();
		}else if(result.equals("ribpots")){
			ribpots();
		}else if(result.equals("musselpots")){
			musselpots();
		}
	}
	private void musselpots()
	{
		tv[0].setText("홍합탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.musselpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("홍합")){
				tv[1].setText("홍합");
				tv[1].setTextColor(Color.BLUE);
			}else{
				tv[1].setText("홍합");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. 홍합은 깨끗하게 여러 번 씻고 홍합의 잔털을 빼준다.");
		tv[3].setText("2. 홍합이 잠길 정도의 물을 붓고 청주와 편으로 썬 마늘을 넣고 삶아준다.");
		tv[4].setText("3. 홍합이 입을 벌리면 송송 썬 대파와 어슷 썬 청, 홍고추를 넣고 소금간을 한 다음 불을 끈다.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}
	private void ribpots()
	{
		tv[0].setText("갈비탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.ribpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("소갈비")){
				tv[1].setText("소갈비");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("소갈비");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("무")){
				tv[2].setText("무");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("무");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("양파")){
				tv[3].setText("양파");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("양파");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 갈비는 찬물에 30분 정도 담가 핏물를 제거한 후 갈비살에 살짝 칼집을 낸다.");
		tv[5].setText("2. 당면은 미지근한 물에 30분 정도 담갔다 끓는 물에 2∼3분 정도 데쳐 놓는다.");
		tv[6].setText("3. 대파 1뿌리는 송송 썰어 놓는다.");
		tv[7].setText("4. 큰 냄비에 갈비, 무, 양파, 대파 1뿌리, 통마늘, 생강, 물 15컵을 넣어 고기가 다 익을 때까지 푹 끓인다.");
		tv[8].setText("5. 끓인 갈비탕에 당면과 송송 썬 대파를 넣은 후 소금, 후춧가루로 간을 한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	private void fishcakepots()
	{
		tv[0].setText("어묵탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.fishcakepots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("어묵")){
				tv[1].setText("어묵");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("어묵");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("무")){
				tv[2].setText("무");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("무");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("멸치")){
				tv[3].setText("멸치");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("멸치");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 물을 붓고 무와 멸치, 다시마, 대파를 넣은 후 육수가 우러나도록 푹 끓인다.");
		tv[5].setText("2. 육수가 충분히 우러나면 간장과 국수장국으로 밑간을 한다.");
		tv[6].setText("3. 육수가 끓는 동안 동그란 어묵은 어슷썰기 하고, 편편한 어묵은 세로 1cm, 가로 4cm 크기로 자른다.");
		tv[7].setText("4. 육수에 어묵을 넣고 5분쯤 끓인다.");
		tv[8].setText("5. 5cm 길이로 썬 쑥갓을 고명으로 얹어 낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	private void mushroompots()
	{
		tv[0].setText("송이탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mushroompots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("송이버섯")){
				tv[1].setText("송이버섯");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("송이버섯");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("소고기")){
				tv[2].setText("소고기");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("소고기");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. 국용 쇠고기는 납작납작하게 썰어서 소금, 참기름, 후춧가루, 다진 마늘 등을 넣고 골고루 양념한 후에 물을 부어 맑은 장국을 끓여서 청장으로 간을 맞춘다.");
		tv[4].setText("2. 송이는 뿌리 쪽을 칼로 도려내고 젖은 행주로 닦아낸 다음 갓 부분에 칼을 넣어 0.3 cm의 두께로 얇게 저민다.");
		tv[5].setText("3. 달걀을 황백으로 나누어 소금을 약간 넣고 풀어서 번철에 얇은 지단을 부쳐서 한 면이 2cm의 완자형으로 썬다.");
		tv[6].setText("4. 실파는 다듬어 4cm의 길이로 썬다.");
		tv[7].setText("5. 장국을 펄펄 끓여서 송이와 실파를 넣고 잠깐 끓여서 바로 그릇에 담고 황백 지단을 띄워 낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	private void gaegookpots()
	{
		tv[0].setText("미역냉국");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.gaegookpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("미역")){
				tv[1].setText("미역");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("미역");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("된장")){
				tv[2].setText("된장");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("된장");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("물")){
				tv[3].setText("물");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("물");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 미역은 충분하게 물을 부어 불려준다.");
		tv[5].setText("2. 적당하게 썰어 물기 뺀 미역에 분량의 양념을 넣고 무쳐준다.");
		tv[6].setText("3. 한번 끓여서 차게 식힌 육수를 부어준다.");
		tv[7].setText("4. 3에 송송 썬 부추를 띄워낸다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	private void doogolepots()
	{
		tv[0].setText("두골탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.doogolepots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("소두골")){
				tv[1].setText("소두골");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("소두골");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("쇠고기")){
				tv[2].setText("쇠고기");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("쇠고기");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("계란")){
				tv[3].setText("계란");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("계란");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("실파")){
				tv[4].setText("실파");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("실파");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. 쇠고기는 납작납작하게 썰어서 청장, 다진 마늘, 참기름, 깨소금, 후춧가루 등으로 양념한 후에 물을 부어 장국을 끓인다.");
		tv[6].setText("2. 두골의 겉에 묻은 핏줄과 흰 막을 벗기고 얇게 저며서 소금과 후춧가루를 골고루 뿌린 다음 밀가루를 묻히고 계란을 씌워서 프라이팬에 기름을 넉넉히 두르고 전을 부친다.");
		tv[7].setText("3. 실파는 다듬어 3cm 길이로 자른다.");
		tv[8].setText("4. 장국에 두골전과 실파를 넣고 살짝 끓여 그릇에 담는다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	private void seafoodpots()
	{
		tv[0].setText("해물탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.seafoodpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("꽃게")){
				tv[1].setText("꽃게");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("꽃게");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("낙지")){
				tv[2].setText("낙지");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("낙지");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("오징어")){
				tv[3].setText("오징어");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("오징어");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("무")){
				tv[4].setText("무");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("무");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("물")){
				tv[5].setText("물");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("물");
				tv[5].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("양파")){
				tv[6].setText("양파");
				tv[6].setTextColor(Color.BLUE);
				break;
			}else{
				tv[6].setText("양파");
				tv[6].setTextColor(Color.RED);
			}
		}
		tv[7].setText("1. 무를 너비 3cm, 길이 4cm의 직사각형으로 썰고, 애호박은 반달썰기 한다.");
		tv[8].setText("2. 끓는 물에 고추장을 풀고 무를 넣어 끓인다.");
		tv[9].setText("3. 오징어는 내장을 제거하고 깨끗하게 씻어 껍질을 제거한 후 몸통은 둥글게 썰고 다리는 적당한 길이로 썬다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		list.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
		howto.addView(tv[9]);
		TextView tv = new TextView(this);
		tv.setText("4. 양파는 굵게 채썰고, 풋고추, 홍고추, 대파는 어슷썬 다음(0.3cm) 쑥갓을 3cm 길이로 썬다.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("5. 2가 끓으면 꽃게, 낙지, 오징어 등을 넣고 양파, 풋고추, 홍고추, 대파를 넣어 끓이다가 다진 양념으로 간을 맞춘 후 마지막에 쑥갓을 넣는다.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}
	public void beefpots(){
		tv[0].setText("사골곰탕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beefpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("사골")){
				tv[1].setText("사골");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("사골");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("물")){
				tv[2].setText("물");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("물");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("마늘")){
				tv[3].setText("마늘");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("마늘");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 사골은 한 시간 정도 담가 두어 핏물을 제거한다.");
		tv[5].setText("2. 곰탕냄비에 사골을 넣고 한소끔 끓여 그 물을 버리고 한 번 헹구어 준비한다.");
		tv[6].setText("3. 한 번 헹구어둔 사골은 다시 곰탕냄비에 담고 물과 통마늘, 후추를 넣고 뽀얀 국물이 우러나도록 7~8시간 정도 뼈에 구멍이 생기도록 뽀얗게 고아낸다.");
		tv[7].setText("4. 뽀얗게 고아지면 뼈를 건져내고 차갑게 식혀 기름을 건져낸 후 다시 뜨겁게 국물을 가열하여 완성 그릇에 밥을 담고 국물을 얹어 송송 썬 대파와 소금과 함께 상에 낸다");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
