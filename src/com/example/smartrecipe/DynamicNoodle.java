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

public class DynamicNoodle extends Activity
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
		if(result.equals("naengmyeon")){
			naengmyeon();
		}else if(result.equals("udon")){
			udon();
		}else if(result.equals("noodle")){
			noodle();
		}else if(result.equals("pasta")){
			pasta();
		}else if(result.equals("mixture")){
			mixture();
		}else if(result.equals("jajangmyeon")){
			jajangmyeon();
		}else if(result.equals("sujebi")){
			sujebi();
		}else if(result.equals("soba")){
			soba();
		}else if(result.equals("ramen")){
			ramen();
		}
	}
	public void naengmyeon(){
		tv[0].setText("냉면");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.naengmyeon);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("냉면")){
				tv[1].setText("냉면");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("냉면");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("동치미국물")){
				tv[2].setText("동치미국물");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("동치미국물");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("육수")){
				tv[3].setText("육수");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("육수");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. 육수는 기름을 완전히 걷어 내고 소금과 재래간장으로 간을 맞춘 후 차게 식힌다.");
		tv[5].setText("2. 차게 식힌 육수와 동치미국물을 반반 섞고 식초, 소금, 설탕으로 간을 맞추어 냉면장국을 만든다.");
		tv[6].setText("3. 냄비에 물을 넉넉히 붓고 물이 끓으면 국수를 넣어 삶아 냉수에 여러 번 가볍게 헹구어 1인분씩 사리를 만들어 놓는다.");
		tv[7].setText("4. 대접에 냉면을 담고 차갑게 식힌 냉면육수를 조심스럽게 부어 담는다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	public void udon(){
		tv[0].setText("우동");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.udon);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("우동면")){
				tv[1].setText("우동면");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("우동면");
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
			if(arr.get(i).equals("육수")){
				tv[3].setText("육수");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("육수");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("다시마 사방")){
				tv[4].setText("다시마 사방");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("다시마 사방");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("국물용 멸치")){
				tv[5].setText("국물용 멸치");
				tv[5].setTextColor(Color.BLUE);
				break;
				
			}else{
				tv[5].setText("국물용 멸치");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 국물용 멸치는 머리와 내장을 제거한 후 냄비에 분량의 물과 다시마를 넣어 함께 끓인다.");
		tv[7].setText("2. 1의 멸치 국물이 우러나면 멸치와 다시마를 건져내고 우동면을 넣어 끓인다.");
		tv[8].setText("3. 간장, 맛술, 소금으로 간한 후 원하는 고명을 올린다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void noodle(){
		tv[0].setText("잔치국수");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.noodle);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("국수")){
				tv[1].setText("국수");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("국수");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("멸치")){
				tv[2].setText("멸치");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("멸치");
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
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("청주")){
				tv[4].setText("청주");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("청주");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("국물용 멸치")){
				tv[5].setText("국물용 멸치");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("국물용 멸치");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 냄비에 물를 넣고 멸치, 다시마, 대파, 청주를 넣고 끓이다가 물이 끓어 오르면 다시마를 건지고, 뭉근히 40분 정도 끓여 육수를 만든다.");
		tv[7].setText("2. 끓는 물에 국수를 넣어 거품이 오르면 찬물을 200ml 붓고, 3번 정도 반복해서 국수를 삶는다. 국수는 찬물에 헹궈 준비한다.");
		tv[8].setText("3. 국수는 준비된 육수에 살짝 담가 따스하게 한 다음 국물을 적당하게 붓고 고명을 올린다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void pasta(){
		tv[0].setText("스파게티");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pasta);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("스파게티")){
				tv[1].setText("스파게티");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("스파게티");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("토마토")){
				tv[2].setText("토마토");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("토마토");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("올리브유")){
				tv[3].setText("올리브유");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("올리브유");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("베이컨")){
				tv[4].setText("베이컨");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("베이컨");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("양파")){
				tv[5].setText("양파");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("양파");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 올리브유를 두른 팬에 다진 양파와 베이컨 세로, 가로 각각 1cm을 중불에서 3분간 볶는다.");
		tv[7].setText("2. 팬에 잘게 자른 고추를 넣고 볶다가 화이트와인을 넣어 증발시킨다.");
		tv[8].setText("3. 토마토홀, 설탕, 소금과 후추로 간하고 15분 정도 뚜껑 열고 중간 불에서 끓인다. 채썬 바질을 넣는다.");
		tv[9].setText("4. 알덴테로 삶은 스파게티를 불에서 소스와 버무리고 소금, 후추로 간하여 마무리한다.");
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
	public void mixture(){
		tv[0].setText("짬뽕");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mixture);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("생면")){
				tv[1].setText("생면");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("생면");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("오징어")){
				tv[2].setText("오징어");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("오징어");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("돼지고기")){
				tv[3].setText("돼지고기");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("돼지고기");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("양파")){
				tv[4].setText("양파");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("양파");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("청경채")){
				tv[5].setText("청경채");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("청경채");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 청경채는 4cm 길이로 썰고, 양파는 채썬다. 오징어는 안쪽에 칼집을 넣고 돼지고기는 먹기 좋은 크기로 썬다.");
		tv[7].setText("2. 끓는 물에 생면을 익히고, 찬물에 깨끗이 씻어 물기를 제거한다.");
		tv[8].setText("3. 팬에 고추기름을 두르고  청주와 간장을 넣는다. 그 후 나머지 재료를 넣고 볶다가 두반장을 넣어 간을 맞추고, 육수 200ml를 넣고 끓인다.");
		tv[9].setText("4. 재료가 반쯤 익으면 육수와 소금, 치킨파우더를 붓고 끓인다.");
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
		tv.setText("5. 4의 고기와 채소가 맛이 우러나면 물녹말을 뿌려 걸쭉한 농도로 끓여서 불에서 내린다.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("6. 생우동을 끓는 소금물에 쫄깃하게 삶아 체에 밭쳐 물기를 뺀 후 그릇에 담고 만들어 놓은 자장을 듬뿍 붓는다. 오이채를 곱게 썰어 고명으로 올려 상에 낸다.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}
	public void jajangmyeon(){
		tv[0].setText("짜장면");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.jajangmyeon);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("생면")){
				tv[1].setText("생면");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("생면");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("춘장")){
				tv[2].setText("춘장");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("춘장");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("돼지고기")){
				tv[3].setText("돼지고기");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("돼지고기");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("물녹말")){
				tv[4].setText("물녹말");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("물녹말");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("양파")){
				tv[5].setText("양파");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("양파");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 돼지고기와 양파는 사방 1㎝ 크기로 각각 썬다. 대파는 송송 썰고 생강과 마늘은 곱게 다진다.");
		tv[7].setText("2. 팬에 기름을 넉넉하게 두르고 생강과 마늘을 볶아 향이 올라오면 돼지고기를 넣어 센 불에서 빠르게 볶으면서 섞는다. 고기가 익으면 양파와 대파를 넣고 함께 볶는다.");
		tv[8].setText("3. 다른 팬에 기름을 넉넉하게 두르고 춘장을 넣어서 중간 불에서 설탕을 넣어 함께 볶는다. 오래도록 볶아야 자장이 부드럽다.");
		tv[9].setText("4. 3에 고기와 채소 볶은 것을 넣어서 고루 섞어 물을 붓고 끓인다.");
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
		tv.setText("5. 국수를 뜨거운 물에 살짝 데우고 그릇에 담아 그 위에 국물과 재료를 부어낸다.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
	}
	public void sujebi(){
		tv[0].setText("수제비");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.sujebi);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("물")){
				tv[1].setText("물");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("물");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("다시마")){
				tv[2].setText("다시마");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("다시마");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("감자")){
				tv[3].setText("감자");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("감자");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("밀가루")){
				tv[4].setText("밀가루");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("밀가루");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("멸치")){
				tv[5].setText("멸치");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("멸치");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 밀가루와 소금을 체에 쳐서 물, 식용유를 넣어 반죽을 만들고 비닐에 넣어 냉장고에서 20분 정도 숙성시킵니다.");
		tv[7].setText("2. 냄비에 분량의 육수 재료를 넣어 끓여 다시마, 멸치는 건져냅니다.");
		tv[8].setText("3. 감자는 반달모양으로 썹니다.");
		tv[9].setText("4. 냄비에 참기름을 두르고 감자를 볶다 육수를 넣고 국 간장, 소금을 넣고 끓입니다.");
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
		tv.setText("5. 중 불에서 수제비 반죽을 뜯어 넣고 저어가며 끓입니다.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("6. 반죽이 떠오르면 양파, 애 호박을 넣고 다진 마늘, 대파, 후춧가루를 넣어 한소끔 끓여 그릇에 담아냅니다.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}
	public void soba(){
		tv[0].setText("야키소바");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.soba);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("생우동")){
				tv[1].setText("생우동");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("생우동");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("가다랑어포")){
				tv[2].setText("가다랑어포");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("가다랑어포");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("올리브오일")){
				tv[3].setText("올리브오일");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("올리브오일");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("참치액")){
				tv[4].setText("참치액");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("참치액");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("맛술")){
				tv[5].setText("맛술");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("맛술");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 생우동은 끓는 물에 넣어 쫄깃하게 삶아서 찬물에 헹궈 물기를 뺀다.");
		tv[7].setText("2. 팬에 올리브오일을 두르고 다진 마늘과 양파를 넣어 볶고 생우동과 애호박도 넣어 맛술과 참치액으로 버무려 볶는다.");
		tv[8].setText("3. 볶아낸 ④의 우동에 소금과 후춧가루, 가다랑어포를 넣어 버무린 후 그릇에 담고 실파 송송 썬 것을 뿌린다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void ramen(){
		tv[0].setText("야키소바");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.soba);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("라면")){
				tv[1].setText("라면");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("라면");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("라면스프")){
				tv[2].setText("라면스프");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("라면스프");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("달걀")){
				tv[3].setText("달걀");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("달걀");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("물")){
				tv[4].setText("물");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("물");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("대파")){
				tv[5].setText("대파");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("대파");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 550ml의 물을 냄비에 넣고 끓이다가 물이 끓으면 라면스프를 먼저 넣고 5분 정도 끓여준다.");
		tv[7].setText("2. 라면스프를 넣은 물이 끓으면 라면 면발을 넣고 잘 풀어주며 3분 정도 더 끓여준다.");
		tv[8].setText("3. 라면 면발이 어느 정도 익으면 달걀 1개를 넣고 1분간 더 끓이다가 상에 내기 전 송송 썬 대파를 얹어주어 완성한다.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		list.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
}
