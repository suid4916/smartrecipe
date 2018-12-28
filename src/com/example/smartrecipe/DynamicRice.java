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
import android.widget.Toast;

public class DynamicRice extends Activity
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
			e.printStackTrace();
		}
	//	Toast toast = Toast.makeText(this,arr.get(0), Toast.LENGTH_SHORT);
	//	toast.show();
		select();
	}
	public void select(){
		if(result.equals("whiterice")){
			whiteRice();
		}else if(result.equals("peasrice")){
			peasRice();
		}else if(result.equals("steamedrice")){
			steamedRice();
		}else if(result.equals("chestnutrice")){
			chestnutRice();
		}else if(result.equals("potatorice")){
			potatoRice();
		}else if(result.equals("sweetpotatorice")){
			sweetpotatoRice();
		}else if(result.equals("mushroomrice")){
			mushroomRice();
		}else if(result.equals("gondeurerice")){
			gondeureRice();
		}else if(result.equals("beansproutrice")){
			beansproutRice();
		}
	}
	public void whiteRice(){
		tv[0].setText("��ҹ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.whiterice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. �ҿ� ���� ����� �װ� �绡�� ��� �ٷ� ���� ���� ������ ���ְ� �� ���� ������ ������ ���� ���� �󱺴�.");
		tv[4].setText("2. ���� ����� �װ� �������� 30��, �ܿ￡�� 2�ð� ���� �Ҹ� ���� ������ ��Ƽ� ���⸦ ����.");
		tv[5].setText("3. �ܿ� ���� ��� �з��� ���� �ξ� �ߺҿ��� �����Ͽ� ���� �ҷ� ���̰� ��ġ�� ���� ������ 4~5�� ���� ���д�.");
		tv[6].setText("4. ���� ���� ���ϰ� �Ͽ� 15�� ���� ������ ���� ���� ���� 5�� ���� ���ҷ� ������ ������ ���� ���� �� ���� ����.");
		tv[7].setText("5. �Ѳ��� ���� ä�� 10~15�� ���� ���� ���� ���� ���Ʒ��� �� ���� �ش�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	public void peasRice(){
		tv[0].setText("�ϵ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.peasrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ϵ���")){
				tv[3].setText("�ϵ���");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�ϵ���");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. �Ұ� �������� ���� �� 30�� ���� �Ҹ���.");
		tv[5].setText("2. �Ҹ� �Ұ� �ϵ��ῡ �з��� ���� �װ� ���� ���´�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}
	public void steamedRice(){
		tv[0].setText("�Ϲ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[3].setText("��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("��");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. �Ұ� �������� ���� �� 30�� ���� �Ҹ���.");
		tv[5].setText("2. �Ҹ� �Ұ� �Ͽ� �з��� ���� �װ� ���� ���´�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}
	public void chestnutRice(){
		tv[0].setText("���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.chestnutrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[3].setText("��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("��");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ���� ������ �ľ� ����� ��⵵�� ���� �װ� 1~2�ð� ���� �Ҹ���.");
		tv[5].setText("2. ���� ������ ������ ���� ū ���� 4���, ���� ���� 2��� �Ͽ� ���� ������ �ʰ� �Ӷ߹��� �㰡�д�.");
		tv[6].setText("3. ���� ������ ���� �ܿ� �ҷ� �� �Ұ� ���� ���� ��ġ��, ���� �Ҹ� 1�� ���� �买�� �װ� �ұ��� ���Ѵ�.");
		tv[7].setText("4. ó���� �� �ҿ��� ���̴ٰ� �츣�� ��������� �ߺҷ� �ٿ� ���������ϰ� ���δ�.");
		tv[8].setText("5. �买�� ����� ���� �ٽ� ���Ƶ�� �Ҹ��� ���� ���� ���ϰ� ���̰� 10�� ���� ���� ǫ ���δ�.");
		tv[9].setText("6. ���� ��� ���̵��� �ְ����� ���Ʒ��� ������ �и鼭 ���� �� ������ �ʰ� ��׸��� ��´�.");
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
	public void potatoRice(){
		tv[0].setText("���ڹ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.potatorice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[3].setText("����");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("����");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ���� �Ͼ �� 30�а� �ҷ��ΰ� ���ڴ� �ľ ������ ����� ��°�� ���� �ְ� ��´�.");
		tv[5].setText("2. ���ڰ� ���� ������ ���� �Ҹ� ���� �ְ� ���� ���´�.");
		tv[6].setText("3. �̶� ���� �����ϸ� ���� ���� ��ŭ�� ���� �����ϰ� ���� �� �鿩�� ���Ⱑ ������ �ŵξ����� ���ڸ� �ְ����� �����鼭 ���´�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}
	public void sweetpotatoRice(){
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.sweetpotatorice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[3].setText("����");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("����");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ������ ������ ���ܼ� ���� ��α� ������� ��� ������ �� �� ��� ���� ����.");
		tv[5].setText("2. ���� �ľ� 30�� ���� �Ҹ� �� ���⸦ ����.");
		tv[6].setText("3. �Ұ� ������ ��� �ܿ� ��ġ�� �买�� �ξ� ���δ�.");
		tv[7].setText("4. ��������� �ߺҷ� ���̰� �Ҿ��� ������ ���� ���ϰ� �Ͽ� ���� ���� �� �� ���� ��.");
		tv[8].setText("5. ȫ����, ǲ���ߴ� ���� ���� ���� ������ ������, ���尡��, ���ұ�, ���⸧���� ������� ����� ����δ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void mushroomRice(){
		tv[0].setText("ǥ�������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mushroomrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("ǥ�����")){
				tv[3].setText("ǥ�����");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("ǥ�����");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ǥ������� �������� ���� �ҷ��� ����� ���� ���� ä ��� �д�.");
		tv[5].setText("2. ���� �� ���� 30�� ���� �ľ� ����� �Ҹ� �Ŀ� ���⸦ ����.");
		tv[6].setText("3. �Ұ� ǥ������� ���� �ܿ� ��ġ�� �买�� �ξ� ���δ�.");
		tv[7].setText("4. ��������� �ߺҷ� ���̰� ä ��� ���� ȣ���� ���� ��� ���� ���� �� �� �Ʒ����� �����ش�.");
		tv[8].setText("5. ȫ���� ǲ���� ���� ����, ���� ������ ������, ���ұ�, ���尡��, ���⸧���� ������������ ����δ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void gondeureRice(){
		tv[0].setText("��巹��");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.gondeurerice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��巹")){
				tv[3].setText("��巹");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("��巹");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ��巹�� ���� ���� ��� ���� ���� �Ŀ� �Ա� ���� ũ��� ��� ���´�.");
		tv[5].setText("2. ���� ���� �ҷ� ������ �Ĵ´�.");
		tv[6].setText("3. ��� ���� ��巹������ �ұ�, ��⸧, ����� �ְ� ��������.");
		tv[7].setText("4. ��巹������ �� �ؿ� ��� ���� ���� �־� ���� �װ� ���� ���´�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	public void beansproutRice(){
		tv[0].setText("�ᳪ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beansproutrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("��");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ᳪ��")){
				tv[3].setText("�ᳪ��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�ᳪ��");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ���� 3ȸ ���� ������ �ľ� �Ͼ� 30�а��� �Ҹ� �� ü�� ���� ���⸦ ����.");
		tv[5].setText("2. �ᳪ���� �ٵ�� �ľ� ���� ���⸦ ����.");
		tv[6].setText("3. �Ұ� �ᳪ���� ���� ������ ������ ��ܿ� ���� ���� ��ġ�� �ٽ� �ݺ��Ͽ� �Ұ� �ᳪ���� ��´�.");
		tv[7].setText("4. 3�� �买�� �ξ� ó������ �� �ҿ� �÷� ��������� ���� �ߺҷ� �Ͽ� �Ҿ��� ������ ���� ���ϰ� �ϰ� ���� ����� ���δ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
