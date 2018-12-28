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
		tv[0].setText("�ø�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.naengmyeon);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ø�")){
				tv[1].setText("�ø�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�ø�");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��ġ�̱���")){
				tv[2].setText("��ġ�̱���");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��ġ�̱���");
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
		tv[4].setText("1. ������ �⸧�� ������ �Ⱦ� ���� �ұݰ� �緡�������� ���� ���� �� ���� ������.");
		tv[5].setText("2. ���� ���� ������ ��ġ�̱����� �ݹ� ���� ����, �ұ�, �������� ���� ���߾� �ø��屹�� �����.");
		tv[6].setText("3. ���� ���� �˳��� �װ� ���� ������ ������ �־� ��� �ü��� ���� �� ������ �󱸾� 1�κо� �縮�� ����� ���´�.");
		tv[7].setText("4. ������ �ø��� ��� ������ ���� �ø������� ���ɽ����� �ξ� ��´�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	public void udon(){
		tv[0].setText("�쵿");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.udon);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�쵿��")){
				tv[1].setText("�쵿��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("�쵿��");
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
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ٽø� ���")){
				tv[4].setText("�ٽø� ���");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("�ٽø� ���");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("������ ��ġ")){
				tv[5].setText("������ ��ġ");
				tv[5].setTextColor(Color.BLUE);
				break;
				
			}else{
				tv[5].setText("������ ��ġ");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. ������ ��ġ�� �Ӹ��� ������ ������ �� ���� �з��� ���� �ٽø��� �־� �Բ� ���δ�.");
		tv[7].setText("2. 1�� ��ġ ������ �췯���� ��ġ�� �ٽø��� �������� �쵿���� �־� ���δ�.");
		tv[8].setText("3. ����, ����, �ұ����� ���� �� ���ϴ� ����� �ø���.");
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
		tv[0].setText("��ġ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.noodle);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[1].setText("����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("����");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��ġ")){
				tv[2].setText("��ġ");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��ġ");
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
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("û��")){
				tv[4].setText("û��");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("û��");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("������ ��ġ")){
				tv[5].setText("������ ��ġ");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("������ ��ġ");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. ���� ���� �ְ� ��ġ, �ٽø�, ����, û�ָ� �ְ� ���̴ٰ� ���� ���� ������ �ٽø��� ������, ������ 40�� ���� ���� ������ �����.");
		tv[7].setText("2. ���� ���� ������ �־� ��ǰ�� ������ ������ 200ml �װ�, 3�� ���� �ݺ��ؼ� ������ ��´�. ������ ������ ��� �غ��Ѵ�.");
		tv[8].setText("3. ������ �غ�� ������ ��¦ �㰡 �����ϰ� �� ���� ������ �����ϰ� �װ� ����� �ø���.");
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
		tv[0].setText("���İ�Ƽ");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pasta);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���İ�Ƽ")){
				tv[1].setText("���İ�Ƽ");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("���İ�Ƽ");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�丶��")){
				tv[2].setText("�丶��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("�丶��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ø�����")){
				tv[3].setText("�ø�����");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�ø�����");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("������")){
				tv[4].setText("������");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("������");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[5].setText("����");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("����");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. �ø������� �θ� �ҿ� ���� ���Ŀ� ������ ����, ���� ���� 1cm�� �ߺҿ��� 3�а� ���´�.");
		tv[7].setText("2. �ҿ� �߰� �ڸ� ���߸� �ְ� ���ٰ� ȭ��Ʈ������ �־� ���߽�Ų��.");
		tv[8].setText("3. �丶��Ȧ, ����, �ұݰ� ���߷� ���ϰ� 15�� ���� �Ѳ� ���� �߰� �ҿ��� ���δ�. ä�� ������ �ִ´�.");
		tv[9].setText("4. �˵��׷� ���� ���İ�Ƽ�� �ҿ��� �ҽ��� �������� �ұ�, ���߷� ���Ͽ� �������Ѵ�.");
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
		tv[0].setText("«��");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mixture);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[1].setText("����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("����");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��¡��")){
				tv[2].setText("��¡��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��¡��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�������")){
				tv[3].setText("�������");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�������");
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
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("û��ä")){
				tv[5].setText("û��ä");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("û��ä");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. û��ä�� 4cm ���̷� ���, ���Ĵ� ä���. ��¡��� ���ʿ� Į���� �ְ� �������� �Ա� ���� ũ��� ���.");
		tv[7].setText("2. ���� ���� ������ ������, ������ ������ �ľ� ���⸦ �����Ѵ�.");
		tv[8].setText("3. �ҿ� ���߱⸧�� �θ���  û�ֿ� ������ �ִ´�. �� �� ������ ��Ḧ �ְ� ���ٰ� �ι����� �־� ���� ���߰�, ���� 200ml�� �ְ� ���δ�.");
		tv[9].setText("4. ��ᰡ ���� ������ ������ �ұ�, ġŲ�Ŀ���� �װ� ���δ�.");
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
		tv.setText("5. 4�� ���� ä�Ұ� ���� �췯���� ���츻�� �ѷ� ������ �󵵷� ������ �ҿ��� ������.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("6. ���쵿�� ���� �ұݹ��� �̱��ϰ� ��� ü�� ���� ���⸦ �� �� �׸��� ��� ����� ���� ������ ��� �״´�. ����ä�� ���� ��� ������� �÷� �� ����.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}
	public void jajangmyeon(){
		tv[0].setText("¥���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.jajangmyeon);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[1].setText("����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("����");
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
			if(arr.get(i).equals("�������")){
				tv[3].setText("�������");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�������");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���츻")){
				tv[4].setText("���츻");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("���츻");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[5].setText("����");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("����");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. �������� ���Ĵ� ��� 1�� ũ��� ���� ���. ���Ĵ� �ۼ� ��� ������ ������ ���� ������.");
		tv[7].setText("2. �ҿ� �⸧�� �˳��ϰ� �θ��� ������ ������ ���� ���� �ö���� ������⸦ �־� �� �ҿ��� ������ �����鼭 ���´�. ��Ⱑ ������ ���Ŀ� ���ĸ� �ְ� �Բ� ���´�.");
		tv[8].setText("3. �ٸ� �ҿ� �⸧�� �˳��ϰ� �θ��� ������ �־ �߰� �ҿ��� ������ �־� �Բ� ���´�. �������� ���ƾ� ������ �ε巴��.");
		tv[9].setText("4. 3�� ���� ä�� ���� ���� �־ ��� ���� ���� �װ� ���δ�.");
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
		tv.setText("5. ������ �߰ſ� ���� ��¦ ����� �׸��� ��� �� ���� ������ ��Ḧ �ξ��.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
	}
	public void sujebi(){
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.sujebi);
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
			if(arr.get(i).equals("�ٽø�")){
				tv[2].setText("�ٽø�");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("�ٽø�");
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
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�а���")){
				tv[4].setText("�а���");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("�а���");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��ġ")){
				tv[5].setText("��ġ");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("��ġ");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. �а���� �ұ��� ü�� �ļ� ��, �Ŀ����� �־� ������ ����� ��ҿ� �־� ������� 20�� ���� ������ŵ�ϴ�.");
		tv[7].setText("2. ���� �з��� ���� ��Ḧ �־� ���� �ٽø�, ��ġ�� �������ϴ�.");
		tv[8].setText("3. ���ڴ� �ݴ޸������ ��ϴ�.");
		tv[9].setText("4. ���� ���⸧�� �θ��� ���ڸ� ���� ������ �ְ� �� ����, �ұ��� �ְ� ���Դϴ�.");
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
		tv.setText("5. �� �ҿ��� ������ ������ ��� �ְ� ����� ���Դϴ�.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("6. ������ �������� ����, �� ȣ���� �ְ� ���� ����, ����, ���尡�縦 �־� �ѼҲ� ���� �׸��� ��Ƴ��ϴ�.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}
	public void soba(){
		tv[0].setText("��Ű�ҹ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.soba);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���쵿")){
				tv[1].setText("���쵿");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("���쵿");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("���ٶ�����")){
				tv[2].setText("���ٶ�����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("���ٶ�����");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ø������")){
				tv[3].setText("�ø������");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�ø������");
				tv[3].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("��ġ��")){
				tv[4].setText("��ġ��");
				tv[4].setTextColor(Color.BLUE);
				break;
			}else{
				tv[4].setText("��ġ��");
				tv[4].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("����")){
				tv[5].setText("����");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("����");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. ���쵿�� ���� ���� �־� �̱��ϰ� ��Ƽ� ������ ��� ���⸦ ����.");
		tv[7].setText("2. �ҿ� �ø�������� �θ��� ���� ���ð� ���ĸ� �־� ���� ���쵿�� ��ȣ�ڵ� �־� ������ ��ġ������ ������ ���´�.");
		tv[8].setText("3. ���Ƴ� ���� �쵿�� �ұݰ� ���尡��, ���ٶ������� �־� ������ �� �׸��� ��� ���� �ۼ� �� ���� �Ѹ���.");
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
		tv[0].setText("��Ű�ҹ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.soba);
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
			if(arr.get(i).equals("��齺��")){
				tv[2].setText("��齺��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("��齺��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("�ް�")){
				tv[3].setText("�ް�");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("�ް�");
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
			if(arr.get(i).equals("����")){
				tv[5].setText("����");
				tv[5].setTextColor(Color.BLUE);
				break;
			}else{
				tv[5].setText("����");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. 550ml�� ���� ���� �ְ� ���̴ٰ� ���� ������ ��齺���� ���� �ְ� 5�� ���� �����ش�.");
		tv[7].setText("2. ��齺���� ���� ���� ������ ��� ����� �ְ� �� Ǯ���ָ� 3�� ���� �� �����ش�.");
		tv[8].setText("3. ��� ����� ��� ���� ������ �ް� 1���� �ְ� 1�а� �� ���̴ٰ� �� ���� �� �ۼ� �� ���ĸ� ����־� �ϼ��Ѵ�.");
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
