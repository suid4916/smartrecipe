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
		tv[0].setText("ȫ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.musselpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("ȫ��")){
				tv[1].setText("ȫ��");
				tv[1].setTextColor(Color.BLUE);
			}else{
				tv[1].setText("ȫ��");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. ȫ���� �����ϰ� ���� �� �İ� ȫ���� ������ ���ش�.");
		tv[3].setText("2. ȫ���� ��� ������ ���� �װ� û�ֿ� ������ �� ������ �ְ� ����ش�.");
		tv[4].setText("3. ȫ���� ���� ������ �ۼ� �� ���Ŀ� ��� �� û, ȫ���߸� �ְ� �ұݰ��� �� ���� ���� ����.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}
	private void ribpots()
	{
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.ribpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�Ұ���")){
				tv[1].setText("�Ұ���");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�Ұ���");
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
		tv[4].setText("1. ����� ������ 30�� ���� �㰡 �͹��� ������ �� ����쿡 ��¦ Į���� ����.");
		tv[5].setText("2. ����� �������� ���� 30�� ���� �㰬�� ���� ���� 2��3�� ���� ���� ���´�.");
		tv[6].setText("3. ���� 1�Ѹ��� �ۼ� ��� ���´�.");
		tv[7].setText("4. ū ���� ����, ��, ����, ���� 1�Ѹ�, �븶��, ����, �� 15���� �־� ��Ⱑ �� ���� ������ ǫ ���δ�.");
		tv[8].setText("5. ���� �������� ���� �ۼ� �� ���ĸ� ���� �� �ұ�, ���尡��� ���� �Ѵ�.");
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
		tv[0].setText("���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.fishcakepots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�")){
				tv[1].setText("�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�");
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
			if(arr.get(i).equals("��ġ")){
				tv[3].setText("��ġ");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("��ġ");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ���� �װ� ���� ��ġ, �ٽø�, ���ĸ� ���� �� ������ �췯������ ǫ ���δ�.");
		tv[5].setText("2. ������ ����� �췯���� ����� �����屹���� �ذ��� �Ѵ�.");
		tv[6].setText("3. ������ ���� ���� ���׶� ��� ������ �ϰ�, ������ ��� ���� 1cm, ���� 4cm ũ��� �ڸ���.");
		tv[7].setText("4. ������ ��� �ְ� 5���� ���δ�.");
		tv[8].setText("5. 5cm ���̷� �� ������ ������� ��� ����.");
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
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mushroompots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���̹���")){
				tv[1].setText("���̹���");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("���̹���");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�Ұ��")){
				tv[2].setText("�Ұ��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("�Ұ��");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. ���� ����� ���۳����ϰ� �� �ұ�, ���⸧, ���尡��, ���� ���� ���� �ְ� ���� ����� �Ŀ� ���� �ξ� ���� �屹�� ������ û������ ���� �����.");
		tv[4].setText("2. ���̴� �Ѹ� ���� Į�� �������� ���� ���ַ� �۾Ƴ� ���� �� �κп� Į�� �־� 0.3 cm�� �β��� ��� ���δ�.");
		tv[5].setText("3. �ް��� Ȳ������ ������ �ұ��� �ణ �ְ� Ǯ� ��ö�� ���� ������ ���ļ� �� ���� 2cm�� ���������� ���.");
		tv[6].setText("4. ���Ĵ� �ٵ�� 4cm�� ���̷� ���.");
		tv[7].setText("5. �屹�� ���� ������ ���̿� ���ĸ� �ְ� ��� ������ �ٷ� �׸��� ��� Ȳ�� ������ ��� ����.");
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
		tv[0].setText("�̿��ñ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.gaegookpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�̿�")){
				tv[1].setText("�̿�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�̿�");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[2].setText("����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("����");
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
		tv[4].setText("1. �̿��� ����ϰ� ���� �ξ� �ҷ��ش�.");
		tv[5].setText("2. �����ϰ� ��� ���� �� �̿��� �з��� ����� �ְ� �����ش�.");
		tv[6].setText("3. �ѹ� ������ ���� ���� ������ �ξ��ش�.");
		tv[7].setText("4. 3�� �ۼ� �� ���߸� �������.");
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
		tv[0].setText("�ΰ���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.doogolepots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ҵΰ�")){
				tv[1].setText("�ҵΰ�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�ҵΰ�");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[2].setText("����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("����");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���")){
				tv[3].setText("���");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("���");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[4].setText("����");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("����");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. ����� ���۳����ϰ� �� û��, ���� ����, ���⸧, ���ұ�, ���尡�� ������ ����� �Ŀ� ���� �ξ� �屹�� ���δ�.");
		tv[6].setText("2. �ΰ��� �ѿ� ���� ���ٰ� �� ���� ����� ��� ���缭 �ұݰ� ���尡�縦 ���� �Ѹ� ���� �а��縦 ������ ����� ������ �������ҿ� �⸧�� �˳��� �θ��� ���� ��ģ��.");
		tv[7].setText("3. ���Ĵ� �ٵ�� 3cm ���̷� �ڸ���.");
		tv[8].setText("4. �屹�� �ΰ����� ���ĸ� �ְ� ��¦ ���� �׸��� ��´�.");
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
		tv[0].setText("�ع���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.seafoodpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ɰ�")){
				tv[1].setText("�ɰ�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�ɰ�");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[2].setText("����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("����");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��¡��")){
				tv[3].setText("��¡��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("��¡��");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[4].setText("��");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("��");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��")){
				tv[5].setText("��");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("��");
				tv[5].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[6].setText("����");
				tv[6].setTextColor(Color.BLUE);
				break;
			}else{
				tv[6].setText("����");
				tv[6].setTextColor(Color.RED);
			}
		}
		tv[7].setText("1. ���� �ʺ� 3cm, ���� 4cm�� ���簢������ ���, ��ȣ���� �ݴ޽�� �Ѵ�.");
		tv[8].setText("2. ���� ���� �������� Ǯ�� ���� �־� ���δ�.");
		tv[9].setText("3. ��¡��� ������ �����ϰ� �����ϰ� �ľ� ������ ������ �� ������ �ձ۰� ��� �ٸ��� ������ ���̷� ���.");
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
		tv.setText("4. ���Ĵ� ���� ä���, ǲ����, ȫ����, ���Ĵ� ����� ����(0.3cm) ������ 3cm ���̷� ���.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("5. 2�� ������ �ɰ�, ����, ��¡�� ���� �ְ� ����, ǲ����, ȫ����, ���ĸ� �־� ���̴ٰ� ���� ������� ���� ���� �� �������� ������ �ִ´�.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}
	public void beefpots(){
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beefpots);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���")){
				tv[1].setText("���");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("���");
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
		tv[4].setText("1. ����� �� �ð� ���� �㰡 �ξ� �͹��� �����Ѵ�.");
		tv[5].setText("2. �������� ����� �ְ� �ѼҲ� ���� �� ���� ������ �� �� �󱸾� �غ��Ѵ�.");
		tv[6].setText("3. �� �� �󱸾�� ����� �ٽ� �������� ��� ���� �븶��, ���߸� �ְ� �Ǿ� ������ �췯������ 7~8�ð� ���� ���� ������ ���⵵�� �Ǿ�� ��Ƴ���.");
		tv[7].setText("4. �Ǿ�� ������� ���� �������� ������ ���� �⸧�� ������ �� �ٽ� �̰߰� ������ �����Ͽ� �ϼ� �׸��� ���� ��� ������ ��� �ۼ� �� ���Ŀ� �ұݰ� �Բ� �� ����");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
