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
		tv[0].setText("��ġ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pheasant);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��ġ"))
			{
				tv[1].setText("��ġ");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("��ġ");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. ���� �踦 ���� ������ ������ ������ �� �帣�� ���� �ľ� �߰� �丷����.");
		tv[3].setText("2. �Ĵ� ä ��� �з��� ����� �ְ� ������� �����.");
		tv[4].setText("3. ������ ���� ��信 ���� �β��� ���� �־� �ߺҿ��� ������ ������. ���� �� ������ �����ϰ� �ֵ��� ������. �ʹ� �ٽ� ������ �ʴ´�.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}

	private void chili()
	{
		tv[0].setText("ǲ��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.chili);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("ǲ����"))
			{
				tv[1].setText("ǲ����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("ǲ����");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. ���ߴ� ������ �ľ� ������ ���� ��ũ�� ����� �� ���̵��� ������ �վ� �غ��Ѵ�.");
		tv[3].setText("2. ����, û��, ����, ��, ���� ���� �������� �غ��Ѵ�.");
		tv[4].setText("3. �Ŀ��� 1ū���� �θ� �ҿ��� ���߸� ��¦ ���´�.");
		tv[5].setText("4. ���߰� ��¦ �������� ����, û��, ����, ��, ���� �־� �߰��߰� ������ ������ ������������ ���� �� ���⸧�� �ѷ� �ϼ��Ѵ�.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void pork()
	{
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pork);
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
		tv[2].setText("1. ������⸦ �丷 ���� ���� ��信 ��������.");
		tv[3].setText("2. �� ���� ��� 1���� �ְ� 15�а� ��� ������ �����.");
		tv[4].setText("3. ���� �� 1�� 1/3�ſ� ���� 1�� 1/2ū���� �ְ� ������ �丷ģ �ű��⸦ �ְ� �ߺҷ� 30�� ���� ���� ���� ����� �ְ� 20�� �� ������.");
		tv[5].setText("4. ���� ������ ������⸦ ���� ��� ���ÿ� ��� ����� ���η� 6����Ͽ� ���� �ø��� �鱹���� �״´�.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void chicken()
	{
		tv[0].setText("�߰������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.chicken);
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
			if (arr.get(i).equals("�߰�����"))
			{
				tv[2].setText("�߰�����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�߰�����");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. �߰������� ���� ������, �߰����� ������.");
		tv[4].setText("2. ����ݸ��� ���̼��� �ڸ���, ������ ������ ���.");
		tv[5].setText("3. ���, �Ǹ�, ���ĵ� ������.");
		tv[6].setText("4. ���� �߰������ �߰�� ���, �߰���, �׸��� 3�� ��Ḧ �־� ��� ���� �� �Ա� ���� ũ��� ���۵����ϰ� ����� ���´�.");
		tv[7].setText("5. ���� 4�� �ְ� ���ð� ������� �־� ������. ������� ���� ���Ƶ�� ����ݸ��� �־� ���� ������ ���� ����.");
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
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.potato);
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
		tv[2].setText("1. ����, ���, ���Ĵ� ��Ͻ��(��� 2cm)�Ѵ�.");
		tv[3].setText("2. ����, ����, ����, ����, �Ŀ���, ���� ���� �ְ� �ҿ� �÷� ���� ������� ���� �� ���ڸ� ���� �ְ� ������.");
		tv[4].setText("3. ���ڰ� ���� �;��� �� ���Ŀ� ����� �־� ������.");
		tv[5].setText("4. �������� ���� �Ѹ���.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void tofu()
	{
		tv[0].setText("�κ�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.tofu);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�κ�"))
			{
				tv[1].setText("�κ�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�κ�");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. �κδ� ���� 3.5cm, ���� 4.5cm, �β� 0.8cm�� �׸����� ��� �ұ��� �Ѹ� �� ���� ���ַ� ���⸦ ���ش�.");
		tv[3].setText("2. �ҿ� �Ŀ����� �θ��� �߰ſ����� �κθ� �븩�븩�ϰ� ������.");
		tv[4].setText("3. ����, ��, ����, ���ұ�, ����, �������� ������� �����.");
		tv[5].setText("4. ���� �κθ� �ְ� ������� ���� �ٸ� �� ���� �װ� ���� ��� ��������.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void pollack()
	{
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pollack);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�Ͼ�"))
			{
				tv[1].setText("�Ͼ�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�Ͼ�");
				tv[1].setTextColor(Color.RED);
			}
		}
		tv[2].setText("1. �Ͼ�� ������ ũ��� ��� �غ��Ѵ�.");
		tv[3].setText("2. ����, ����, ���� ��, ���� ����, ���� ���� ������� �����.");
		tv[4].setText("3. ���� ������ �Ͼ�� ������� �ְ� ���δ�.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}

	private void croaker()
	{
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.croaker);
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
		tv[3].setText("1. ����� �������̴� �� ���� ����ϰ� 2~3�丷�� ����.");
		tv[4].setText("2. ���Ĵ� 4cm ���̷� ���, ������ ��� ���Ӽ� ���, ������ ��� �� ���(0.2~0.3cm)�Ѵ�.");
		tv[5].setText("3. �з��� ����� ��� ���� �ҿ� ������ �� �� ��� �غ��� ����� �ξ� ���� ������ ������.");
		tv[6].setText("4. �߰� ������ �ҿ� ��� 15~20���̸� �����ϸ�, ���� ���� ���ƿ� ������ ���� ��� �ٽ� �� �� ���δ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void jangjorim()
	{
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.jangjorim);
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
		tv[2].setText("1. ����� �⸧�⸦ �����Ͽ� ���� �㰡 �͹��� �� ���� ���� 6��7�� ������ �� �� ������ �ѷ� �д�.");
		tv[3].setText("2. ���� ���⸧�� �θ��� ��� ��⸦ ���ٰ� ��Ⱑ ��� ��ŭ�� ���� �װ� 30������ ��´�.");
		tv[4].setText("3. �������� ȥ���Ͽ� 2�� ��� ���� �ְ� ó������ ���ҿ��� ���̴ٰ� ������ �ҷ� ���δ�.");
		tv[5].setText("4. ������ �����ϰ� ���� ��⿡ ������� ���ϰ� ��� ��⸦ �������� ���� ���� ���� ������ ���⸧�� �ѹ�� ���� ����߷� �׸��� ��´�.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}
}
