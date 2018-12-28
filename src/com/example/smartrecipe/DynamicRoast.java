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
		tv[0].setText("��¡���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.cuttlefishgrill);
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
			if (arr.get(i).equals("����"))
			{
				tv[2].setText("����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("����");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. ����� ��Ḧ ��� ���� ���� ������� �����.");
		tv[4].setText("2. ��¡��� ������ ������ ���� ������ ���� ������ ���� ���� ���� ���ʿ� �밢������ ������ Į���� ���� �� ����忡 20�а� ����д�.");
		tv[5].setText("3. �̰߰� �ޱ� ��ö�̳� ���迡 ��������� ��� ��¡� ���ٰ� ���� ũ��� �ڸ���.");
		tv[6].setText("4. ���� ä �� ���ĸ� ������ �㰬�ٰ� ���⸦ ���� �� ��鿩 ����.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void beefgrill()
	{
		tv[0].setText("���ⱸ��");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beefgrill);
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
			if (arr.get(i).equals("����"))
			{
				tv[2].setText("����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("����");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���� ����"))
			{
				tv[3].setText("���� ����");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("���� ����");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ����� 2cm ������ ���簢������ �ڸ� �� ���� ����, �ұ�, ���尡��, ������ �־� 30�� ���� ����д�.");
		tv[5].setText("2. ����, �Ǹ��� ���η� �ڸ� �� �ﰢ������ ŭ���ϰ� �ڸ���.");
		tv[6].setText("3. �ҿ� ���͸� ���� �� ������ ���ٰ� ���ĸ� ���´�.");
		tv[7].setText("4. ���⿡ ���⸦ �־� �����鼭 ����̹���, ����, �Ǹ�, ����ݸ��� �ְ� �ұ�, ���尡��� ���� �Ѵ�.");
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
		tv[0].setText("����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.seriolagrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���"))
			{
				tv[1].setText("���");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("���");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("����"))
			{
				tv[2].setText("����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("����");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. ��� �ҽ�(����, û��, �̸�, ����)�� �̸� �����.");
		tv[4].setText("2. �� �Ա� ���� ��� �⸧�� �ణ �θ� �������濡 ���� �����ϴ�.");
		tv[5].setText("3. ���� �غ��ص� �ҽ��� �־��� �� �ҽ��� ����� ���� ������.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void croakergrill()
	{
		tv[0].setText("���ⱸ��");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.croakergrill);
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
		tv[2].setText("1. ����� ����� �ܾ�� �ư��� ������ ������ �� �� �Ҷ߹��� �㰡 �񸰸��� ���ְ� �ľ� ������. ������ �� �ʿ� ���� �� ���� Į���� �ִ´�.");
		tv[3].setText("2. ���⸦ ä�ݿ� �ø��� �ұݰ� �������� �ѷ� ��� �ذ��Ѵ�.");
		tv[4].setText("3. ���� �ҿ� �Ŀ����� �ٸ��� ���⸦ �ø� �� 180���� �µ����� ���� �߰��� ������ 10�� ���� ��������.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}

	private void shadgrill()
	{
		tv[0].setText("�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.shadgrill);
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
		tv[2].setText("1. ����� ����� ����� ������ �ľ� ���⸦ �����Ѵ�.");
		tv[3].setText("2. ������ ���� �ұ��� �Ѹ���.(Į���� ���� �ʴ´�.)");
		tv[4].setText("3. ���迡 ��� �÷� ���� ������ �ָ鼭 �븩�븩�ϰ� ���´�.");
		tv[5].setText("(���踦 �ޱ� �� ŰģŸ�� ���� �̿��� ���迡 �⸧ĥ�� �ѹ� ���� �� ��� �÷� ����� ���迡 ��� �޶���� �ʴ´�.)");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void shellfishgrill()
	{
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.shellfishgrill);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("������"))
			{
				tv[1].setText("������");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("������");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. �������� �ұݹ��� �㰡 �ذ���Ų �� ������ �Ĵ´�.");
		tv[3].setText("2. ������ 4��� �Ͽ� ��� �ʰ������� �з���� �����.");
		tv[4].setText("3. �׸��� �������� �־� 3�� ���� ���� �� ������.");
		tv[5].setText("4. �������� ������ ����̰� �ʰ������� ��� �Դ´�.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void mackerelgrill()
	{
		tv[0].setText("�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mackerelgrill);
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
		tv[2].setText("1. ����� �̽��� ������ ��� ����� �ư��̸� ���� ����ϰ� Į���� ���� �ִ´�.");
		tv[3].setText("2. �޶� ���� �ʰ� ���迡 ���ʸ� ��¦ �߶� �ߺҿ��� �յڷ� ������ ���� ����.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
	}

	private void skewers()
	{
		tv[0].setText("��ġ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.skewers);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�������"))
			{
				tv[1].setText("�������");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�������");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�ٺ�ť �ҽ�"))
			{
				tv[2].setText("�ٺ�ť �ҽ�");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�ٺ�ť �ҽ�");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�߰��"))
			{
				tv[3].setText("�߰��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�߰��");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ������⿡ �ұ�, ���尡�縦 �ѷ� �������� �� �� ��ġ�� ��� �߰��� ������ ���.");
		tv[5].setText("2. �߰��� �Ա� ���� ũ��� ��� ���� ���ߴ� 2cm ���̷� �� ��ġ�� ���.");
		tv[6].setText("3. ���Ĵ� 3cm ���̷� ��� ����̹����� �Բ� ��ġ�� ���. ������ �Թ��� ���� ��°�� ��ġ�� ���� �����ش�.");
		tv[7].setText("4. �ޱ� �׸� �ҿ� �غ��� ��ġ�� �յڷ� ��¦ ���� �� �з��� �ٺ�ť �ҽ��� �ι����� ���� 2~3ȸ ���� ���߶� ���� �յڷ� �븩�ϰ� ���´�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
