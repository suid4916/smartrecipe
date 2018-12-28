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

public class DynamicSoup extends Activity
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
		if (result.equals("beansproutssoup"))
		{
			beansproutssoup();
		}
		else if (result.equals("pollacksoup"))
		{
			pollacksoup();
		}
		else if (result.equals("prophetsoup"))
		{
			prophetsoup();
		}
		else if (result.equals("measlysoup"))
		{
			measlysoup();
		}
		else if (result.equals("haejangsoup"))
		{
			haejangsoup();
		}
		else if (result.equals("seaweedsoup"))
		{
			seaweedsoup();
		}
		else if (result.equals("misosoup"))
		{
			misosoup();
		}
		else if (result.equals("radishsoup"))
		{
			radishsoup();
		}
		else if (result.equals("eggsoup"))
		{
			eggsoup();
		}
	}

	private void eggsoup()
	{
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.eggsoup);
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
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��ġ"))
			{
				tv[3].setText("��ġ");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("��ġ");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ���� ���� ��ġ�� �ְ� ������ �������.");
		tv[5].setText("2. ���, �ұ��� �ְ� ��� ���̵��� �����ش�.");
		tv[6].setText("3. ���� ��ġ�� �������� Ǯ�� ���� ����� �ִ´�.");
		tv[7].setText("4. ���ĸ� �ְ� �ұ�, ���尡�縦 �ְ� ���� �Ѵ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void radishsoup()
	{
		tv[0].setText("��������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.misosoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��"))
			{
				tv[1].setText("��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("��");
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
			if (arr.get(i).equals("����"))
			{
				tv[3].setText("����");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("����");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ���� ��� 2.5�� ũ��� �����ϰ� ��� �ұݹ��� ��� ���� ���⸦ ����.");
		tv[5].setText("2. ���� ������� ��⸧, ���� ������ �־� ���ٰ� ���� �������� �־� ���� ������������ ���´�.");
		tv[6].setText("3. �迡 �Ҷ߹��� �װ� ���� ���� ��Ĳ�ϰ� �����鼭 ������ �췯���� ���ĸ� ���� ä ��� �ְ� �鲢���縦 �־� ���δ�.");
		tv[7].setText("4. �ұ����� ���� �ؼ� �ϼ��Ѵ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void misosoup()
	{
		tv[0].setText("���屹");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.misosoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���屹"))
			{
				tv[1].setText("���屹");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("���屹");
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
			if (arr.get(i).equals("�޷�"))
			{
				tv[3].setText("�޷�");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�޷�");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. �޷��� ������ �ľ� 4cm ���̷� �ڸ���.");
		tv[5].setText("2. �κδ� 2cm ������ ���д�. ���ߴ� �ľ� �ۼ� ���.");
		tv[6].setText("3. ���� ���� �װ� ������ Ǭ ���� ������ ���δ�.");
		tv[7].setText("4. ���� ���屹�� �޷��� �κθ� �ְ� ���δ�.");
		tv[8].setText("4. ������ ����, ���߰���, ���� ������ �־� �� �� �� ���� ����.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}

	private void seaweedsoup()
	{
		tv[0].setText("�̿���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.seaweedow);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�̿�"))
			{
				tv[1].setText("�̿�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�̿�");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�Ұ��"))
			{
				tv[2].setText("�Ұ��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�Ұ��");
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
		tv[4].setText("1. ���� �̿��� ���� �Ҹ� �� ������ ��� �緡������ �ణ �־� ���� �д�.");
		tv[5].setText("2. ����� �߰� ��� ���� ���⸧�� ���� ������ �ְ� ���´�. ��Ⱑ ��� ���� ������ ��� ���� �̿��� �ְ� ���� ���´�.");
		tv[6].setText("3. ����� �̿��� ���� ���� ���� ���� �� �������� ���δ�.");
		tv[7].setText("4. �������� �緡����� �ұ����� ���� �Ͽ� ����.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void haejangsoup()
	{
		tv[0].setText("���屹");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.haejangsoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("Ȳ����"))
			{
				tv[1].setText("Ȳ����");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("Ȳ����");
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
			if (arr.get(i).equals("�ᳪ��"))
			{
				tv[3].setText("�ᳪ��");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�ᳪ��");
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
			if (arr.get(i).equals("�ް�"))
			{
				tv[5].setText("�ް�");
				tv[5].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[5].setText("�ް�");
				tv[5].setTextColor(Color.RED);
			}
		}
		tv[6].setText("1. Ȳ������ �����ϰ� ��� ���� ��� ��ɴٰ� ��¦ ���⸦ ����.");
		tv[7].setText("2. ���� ���ڽ��, �κδ� ��Ͻ�� ���Ĵ� 4cm ���̷� ���д�. �ᳪ���� ������ �ľ� ���⸦ ���� �غ��Ѵ�.");
		tv[8].setText("3. �ҿ� ��⸧�� �θ��� ���� Ȳ�¸� �ְ� ���� �ҿ� �޴� �����ش�.(��⸧�� �� �ҿ� �����ϸ� ���� Ÿ�Ƿ� ���� �ҿ� �����ش�.)");
		tv[9].setText("4. ��⸧�� Ȳ�°� ���� ����ϸ� ���� �װ� ���� �ְ� �����ش�.");
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
		tv.setText("5. ���� �����ϰ� ������, �ᳪ���� �ְ� �����ش�.(�Ѳ��� ���� ���� ���� ���δ�.)");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("6. �ᳪ���� ������ �κθ� �ְ� �ް��� ���Ŀ� Ǯ� �ְ� ���ð� �ұ����� ���ϰ� �������Ѵ�.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}

	private void measlysoup()
	{
		tv[0].setText("����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.measlysoup);
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
		tv[4].setText("1. ��������� �ҹ�⿡ �ø��� �����ش�.");
		tv[5].setText("2. ���尡��, ǥ���������, �緡����, ����, ������, ���尡��, �������� �־� ������� �̸� ����� �д�.");
		tv[6].setText("3. ��������� ���� ������ ����� ������ �ְ� ������, �鲢����, ���ĸ� �÷� ����.");
		tv[7].setText("4. �������̳� �������� �Բ� ����δ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}

	private void prophetsoup()
	{
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.prophetsoup);
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
			if (arr.get(i).equals("�����"))
			{
				tv[2].setText("�����");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�����");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���"))
			{
				tv[3].setText("���");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("���");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�ᳪ��"))
			{
				tv[4].setText("�ᳪ��");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("�ᳪ��");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. ����� ������ �㰡 �͹��� �� ���� ���� ���� �װ� �� �ҿ��� ���̴ٰ� �߰��� ���ð� 15cm ������ ��� �� �ĸ� �ִ´�. ���� �����ϸ� ���� �ٿ��� 6�ð� �̻� ǫ ���δ�.");
		tv[6].setText("2. ������ ���� ����� �췯���� ���� ���� ���� ������ Ǯ� ���δ�.");
		tv[7].setText("3. ������ ���� ���� �ұ��� �ణ �ְ� �� ���ھ� �� �־� ��Ƽ� ������ �㰡 �д�.");
		tv[8].setText("4. �ᳪ���� �Ѹ��� �ٵ�� �İ� ���߳� ��û ������� ���� ���� ���ļ� �ۼ� ���(0.5cm) ������� ���� ������ ���� ���� ��¦ �ֹ����� ���� ���屹�� �ִ´�.");
		tv[9].setText("5. �ѼҲ� ������ ���� ������ �� �� ������ �緡�������� ���� �����.");
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

	private void pollacksoup()
	{
		tv[0].setText("�Ͼ");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.pollacksoup);
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
			if (arr.get(i).equals("���"))
			{
				tv[3].setText("���");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("���");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��ġ"))
			{
				tv[4].setText("��ġ");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("��ġ");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. �Ͼ����� �߰� ���� ���� �Ҹ���.");
		tv[6].setText("2. ���� �Ҹ� �Ͼ �ְ� ���⸧�� ���ٰ� ���� �ְ� ���� ���´�.");
		tv[7].setText("3. ���� ���� �ְ� ���δ�.");
		tv[8].setText("4. �ް��� Ǯ�� ����� ����, ���� ������ �ִ´�.");
		tv[9].setText("5. �ұ����� ���ϰ� ���߸� �ִ´�.");
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

	private void beansproutssoup()
	{
		tv[0].setText("�ᳪ����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beansproutssoup);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�ᳪ��"))
			{
				tv[1].setText("�ᳪ��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�ᳪ��");
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
			if (arr.get(i).equals("�ٽø�"))
			{
				tv[3].setText("�ٽø�");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�ٽø�");
				tv[3].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("��ġ"))
			{
				tv[4].setText("��ġ");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("��ġ");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. �ᳪ���� �帣�� ���� �ľ� ������.");
		tv[6].setText("2. ���� ���� �װ� �ٽø�, ��ġ, ���츦 �־� ���̴ٰ� ��� ��������.");
		tv[7].setText("3. �ᳪ���� �ְ� �Ѳ��� ���� �� �� ���̴ٰ� ��������� ���� �ٿ� 10�а��� �� ���δ�.");
		tv[8].setText("4. �ᳪ������ ���� ���ð� �ۼ� �� �ĸ� �ְ� �ұ����� ���� ���� �ѼҲ� ���� �� ���� ����.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		list.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
}
