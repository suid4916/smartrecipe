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
		tv[0].setText("û����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.soybean);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�Ұ��"))
			{
				tv[1].setText("�Ұ��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�Ұ��");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("û����"))
			{
				tv[2].setText("û����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("û����");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�κ�"))
			{
				tv[3].setText("�κ�");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�κ�");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("����"))
			{
				tv[4].setText("����");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("����");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. ����� �κδ� ��� ������� ��ϴ�.");
		tv[6].setText("2. ���Ĵ� �߰� ������ ����, û��ȫ ���ߴ� ����ϰ� ��ϴ�. ��ȣ���� �ݴ޸������ ��� ���̹����� �ص��� ������ �����մϴ�.");
		tv[7].setText("3. ���⿡ �ذ� ����� �־� ������ �� �ҹ�⿡ ���⸦ ���� �Ҷ߹��� �ְ� ������ û������ Ǯ�� �ֽ��ϴ�.");
		tv[8].setText("4. �κ�, ����, ����, ��ȣ���� �ְ� ���� ����, ���尡��, �ұ��� �־� ���մϴ�.");
		tv[9].setText("5. ���� ����, ���߸� �ְ� �ѼҲ� ���� �� �����ϴ�.");
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
		tv[0].setText("��¡���ġ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.squidstew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��¡��"))
			{
				tv[1].setText("��¡��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("��¡��");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��ġ"))
			{
				tv[2].setText("��ġ");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("��ġ");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. ���� ��ġ�� ��¡� �ְ� ���ҿ��� ��¡� ��¦ ���� ���� �������� ���´�.");
		tv[4].setText("2. ��¡� ������ ���� �ְ� ���ҿ��� �ѹ� ���δ�.");
		tv[5].setText("3. ������� �ұ����� ���� ������ ���ҿ��� 10������ �� ���δ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void pollackstew()
	{
		tv[0].setText("�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pollackstew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("����"))
			{
				tv[1].setText("����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("����");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��"))
			{
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�κ�"))
			{
				tv[3].setText("�κ�");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�κ�");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�������"))
			{
				tv[4].setText("�������");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("�������");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. ���´� �����Ͽ� 4cm �������� �丷���� ���´�.");
		tv[6].setText("2. ���� 0.5cm �β��� ���μ��� 2cm ���̷� ��� ���´�. �κδ� ���μ��� 2cm ���� �β� 0.8cm�� ��� ���´�.");
		tv[7].setText("3. ���� ���� �ְ� ���̴ٰ� ���� ��� ���� ������ ������ �ְ� ���δ�.");
		tv[8].setText("4. �ұݰ� �� �κο� ����, �̳����� �ְ� �ϼ��Ѵ�.");
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
		tv[0].setText("���̵����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.horseradishstew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("����"))
			{
				tv[1].setText("����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("����");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��"))
			{
				tv[2].setText("��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("��");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. ���̴� ���� ���� ��� �ٵ�� ������ �Ĵ´�.");
		tv[4].setText("2. ���� ���� ���̸� ��¦ ���� ������ �󱺴�.");
		tv[5].setText("3. ���� ���� �װ� ��ġ�� �־� ������ ����� �� ü�� ��ģ ����� �������� �ְ� ���δ�.");
		tv[6].setText("4. ������ ���� �� ��ģ ���̿� ����� ���ĸ� �ְ� ���� ���̴ٰ� �ұ����� ���� �����.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void pumpkinstew()
	{
		tv[0].setText("��ġȣ���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.tofustew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���߱�ġ"))
			{
				tv[1].setText("���߱�ġ");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("���߱�ġ");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("����ȣ��"))
			{
				tv[2].setText("����ȣ��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("����ȣ��");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. ���߱�ġ�� �Ա� ���� ũ��� ���.");
		tv[4].setText("2. ȣ���� ������ ����� �����ϰ� ���.");
		tv[5].setText("3. ���Ŀ� ǲ���ߴ� ����ϰ� ���.");
		tv[6].setText("4. ���� ���߱�ġ�� �� 6���� �־� ������ ���� ȣ���� �ְ� ǫ ���δ�.");
		tv[7].setText("5. ���� ���ð� �������� �־� ���� ���� �� ���Ŀ� ǲ���߸� �ִ´�.");
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
		tv[0].setText("���κ��");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.tofustew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���κ�"))
			{
				tv[1].setText("���κ�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("���κ�");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�������"))
			{
				tv[2].setText("�������");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�������");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���߱�ġ"))
			{
				tv[3].setText("���߱�ġ");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("���߱�ġ");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��Ÿ������"))
			{
				tv[4].setText("��Ÿ������");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("��Ÿ������");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. �������� �Ա� ���� ũ��� ��� ���� ����, ���� ����, �ұ��� �־� ����� �� �ҿ� ���⸧ 1ū���� �θ� �� ���´�.");
		tv[6].setText("2. 1�� �߰� �� ��ġ�� �־� ���� ���ٰ� ���� �ְ� ���δ�.");
		tv[7].setText("3. ������ ��������� ���κθ� �ְ� �ٽ� ���δ�. ���̴� ���߿� ��Ÿ������, ����, ǲ����, ȫ���߸� �ִ´�.");
		tv[8].setText("4. ���尡��, ���� ������ �־� �� �� �� ���̰� �ұ����� ���� �Ѵ�.");
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
		tv[0].setText("�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.misostew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("����"))
			{
				tv[1].setText("����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("����");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��ġ"))
			{
				tv[2].setText("��ġ");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("��ġ");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��"))
			{
				tv[3].setText("��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("��");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�κ�"))
			{
				tv[4].setText("�κ�");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("�κ�");
				tv[4].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��"))
			{
				tv[5].setText("��");
				tv[5].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[5].setText("��");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. ���� ���� �ְ� �Ӹ��� ������ ������ ����ġ�� �־� ��ġ������ ����� �� ��ġ�� ��������.");
		tv[7].setText("2. ��ġ������ �췯���� ä�� ������ �־� ���� �ֵ��� ������ Ǯ���ְ� ���尡�縦 �־� ���δ�.");
		tv[8].setText("3. ���� Ǭ ���� ��������� ���۽���� ���� �־� ���� �͵��� �����ش�.");
		tv[9].setText("4. ���� �� ������ ���۽���� ȣ��, �κ�, �ۼ� �� û�����, ���̹���, ���� ����, �ۼ� �� ���ĸ� �־� �ѼҲ� ���� �ϼ��Ѵ�.");
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
		tv[0].setText("������ġ�");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.kimchistew);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i+=2)
		{
			if (arr.get(i).equals("���߱�ġ"))
			{
				tv[1].setText("���߱�ġ");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("���߱�ġ");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�κ�"))
			{
				tv[2].setText("�κ�");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�κ�");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�������"))
			{
				tv[3].setText("�������");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�������");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ��ġ�� �������, �κδ� �Ա����� ũ��� �ڸ��� �Ĵ� ������.");
		tv[5].setText("2. ���� ������⸦ �ְ� ���ٰ� ��ġ�� �Բ��־� �����ش�.");
		tv[6].setText("3. ����� �Ѹ��� ���� �� ���� ���������� �ְ� ���� �����ش�.");
		tv[7].setText("4. �ұ����� ���ϰ� �ĸ� ������ ���� ����.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
