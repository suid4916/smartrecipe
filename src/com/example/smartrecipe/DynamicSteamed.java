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
		tv[0].setText("�Ʊ���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedmonkfish);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�Ʊ�"))
			{
				tv[1].setText("�Ʊ�");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�Ʊ�");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�ᳪ��"))
			{
				tv[2].setText("�ᳪ��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�ᳪ��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�̴���"))
			{
				tv[3].setText("�̴���");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�̴���");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. �Ʊʹ� ������ ũ��� ��� �ľ�д�.");
		tv[5].setText("2. ������ �ణ Ǭ ���� �Ʊ͸� �ְ� ��¦ ��ģ ���� ä�ݿ��� �Ϸ� ���� ������.");
		tv[6].setText("3. �̳����� 6cm ���̷� ���ΰ� ���ĵ� ������ �д�.");
		tv[7].setText("4. �̴����� �ľ ���⸦ �� �غ��Ѵ�.");
		tv[8].setText("5. ��ġ������ �װ� ���� �ƱͿ� ������� �ְ� �ߺҿ��� �����ش�.");
		tv[9].setText("6. �ƱͰ� �����ϰ� ������ ������ �ᳪ���� �ְ� �Ѳ��� ���� ������.");
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
		tv.setText("7. �ᳪ���� ���� ������ �̴����� �ְ� ���� ��� �����ش�.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("8. �츻���� Ǯ�� �����ϰ� �� ���� �̳����� ����, ��, ���⸧�� �ణ �ְ� ���� �ұ����� �Ѵ�.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}

	private void steamedshank()
	{
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedshank);
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
		tv[4].setText("1. ���¸� ���� �㰡 �Ǹ� ���� ������ �Ĵ´�.");
		tv[5].setText("2. ���� ���� �����ϰ� �װ�, ���¿� �Բ� ŭ���ϰ� �� ���ĸ� ���� ���� ��� ���� ��´�. ������ ��ǰ�� �����Ѵ�.");
		tv[6].setText("3. ���� ���´� ������ 4�� ũ��� ��� ����� ����� �־� ���� ��������, ������ ������ �⸧�⸦ �Ⱦ� ����.");
		tv[7].setText("4. ǥ������� �����Ͽ� 4����ϰ�, ����� ��� �𼭸��� ��� ���縸�ϰ� �����.");
		tv[8].setText("5. ���� ���� �ణ�� �ұ��� �ְ� ������ �־� ���ڷ� ���� ���鼭 ������ �����. ���� ������ � �غ��Ѵ�.");
		tv[9].setText("6. ��� ��Ḧ ���� �⸧�⸦ �Ⱦ ���� ������ ������ �ξ� ���δ�.");
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
		tv[0].setText("������");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedperilla);
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
		tv[2].setText("1. ������ ������ �ľ� ���⸦ ����.");
		tv[3].setText("2. �з��� ���� ������� �����.");
		tv[4].setText("3. ���ٿ� ������� ������ ��� ���.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
	}

	private void steamedwing()
	{
		tv[0].setText("�߳�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedwing);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�߳���"))
			{
				tv[1].setText("�߳���");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�߳���");
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
		tv[3].setText("1. �߳����� �ľ ���⸦ �۰� Į���� ���� �� �־� �ְ� �ұݰ� ���尡��� ������ �ذ��Ѵ�.");
		tv[4].setText("2. ������ �߰� ũ���� ���÷� �غ��ؼ� ������ ����� 2����Ѵ�.");
		tv[5].setText("3. ���Ŀ� û��ȫ�Ǹ��� ��� 2�� ũ��� �ڸ���.");
		tv[6].setText("4. �ҿ� �⸧�� �θ��� ������ �־� �븩�ϰ� ���� �� ����ä�� �߳����� �ְ� ���ٰ� û�ֿ� ������ �־� �������� �ٽø� �츰 ���� �ѷ��� �Ѳ��� ���� �߳��� �ӱ��� �͵��� ���� �ҿ��� ���.");
		tv[7].setText("5. �߳����� �ӱ��� ������ �ڸ� ����, û��ȫ�Ǹ��� �ְ� ���� �ұ�, ���尡��� ���� �����.");
		tv[8].setText("6. �뿡 ���츻�� �ణ �ξ ������ �󵵰� �Ǹ� ���⸧�� �ѷ� ������ �� ����.");
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
		tv[0].setText("�̴�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedsquirt);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�̴���"))
			{
				tv[1].setText("�̴���");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�̴���");
				tv[1].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�ᳪ��"))
			{
				tv[2].setText("�ᳪ��");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�ᳪ��");
				tv[2].setTextColor(Color.RED);
			}
		}
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�̳���"))
			{
				tv[3].setText("�̳���");
				tv[3].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[3].setText("�̳���");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. �̴����� �ұݹ��� �ľ� �����д�.");
		tv[5].setText("2. �̳���, ���Ĵ� 5cm ���̷� ���. ���Ĵ� 5mm �β��� ���, ������ 4������� �ڸ��� �����̴� ������ �߶� ���� äģ��.");
		tv[6].setText("3. ������ ���� ü�� �ѹ� �ɷ��� �д�.");
		tv[7].setText("4. �� ���� ����� ��Ḧ ��� �ְ� �� ���´�.\n �� ���� 3�� ������ �װ� �̴����� 4�� ������� �ְ� ���δ�.\n �� ������ ���� Ǭ ���Ұ��縦 �־� �󵵸� �����.\n �� �ᳪ��, ����, �̳���, ����, ����, �����̸� �ְ� �ѼҲ� ���̰� �������� �ұ����� ���� �����.");
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
		tv[0].setText("�Ͼ���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedpollack);
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
		tv[2].setText("1. �Ͼ�(�ڴٸ�)�� ���� �㱸�� �ҷ��� �Ӹ��� ��������, ������ �����ϰ� ������ �켭 ���� �߶󳽴�");
		tv[3].setText("2. 6�� ������ ũ��� 3�丷�� �� ���� �����ʿ� �� Į���� �־� ���׶���� �ʰ� �Ѵ�.");
		tv[4].setText("3. ���� ���� 1�� ���̷� �߶� ���� ä���, ���� �� �Ѹ� �κи� ���� ���� �з��� ����, ����, ��, ���ұ�, ���⸧, ���尡��, ���� ���á��������� ������� �����.");
		tv[5].setText("4. ���� ������ �Ͼ�(�ڴٸ�)�� ��� ������� ������ ���� �ҿ��� õõ�� ���δ�.");
		tv[6].setText("5. �Ͼ�(�ڴٸ�)�� �� ���������� �ǰ���, ��ä�� ��� ��� ���� �鿩�� ������ �Բ� �׸��� ��Ƴ���.");
		list.addView(tv[1]);
		howto.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}

	private void steamedchicken()
	{
		tv[0].setText("���");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedchicken);
		image.addView(iv);
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("�߰��"))
			{
				tv[1].setText("�߰��");
				tv[1].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[1].setText("�߰��");
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
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i).equals("���"))
			{
				tv[4].setText("���");
				tv[4].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[4].setText("���");
				tv[4].setTextColor(Color.RED);
			}
		}
		tv[5].setText("1. ������ ���� 20�а��� ��� �� ��� �ұ�, ����, û�ַ� �ذ��Ѵ�.");
		tv[6].setText("2. ���Ĵ� ��� ���, ���ڿ� ���Ĵ� ��Ͻ�� �صд�. ȫ���ߴ� ������ ���ų� ������ �߶� ����.");
		tv[7].setText("3. �ޱ��� �ҿ� ���⸧�� �θ��� �ذ��� ���� �Ѹ� ��¦ �����ش�.");
		tv[8].setText("4. ��¦ ���� �߿� �ݶ� �ξ� �ѼҲ� ���δ�.");
		tv[9].setText("5. ���ҽ�, ĳ����ҽ�, ���, û�ָ� ������ ��� ��Ḧ �ְ� �����ش�.");
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
		tv.setText("6. �ѼҲ� ���� �� ���ҽ�, ĳ����ҽ��� �ְ� ������ ���� �� ������ ������ ���δ�.");
		tv.setGravity(Gravity.CENTER_HORIZONTAL);
		TextView tv1 = new TextView(this);
		tv1.setText("7. û�ָ� �ְ� ���� �ҷ��� ����� �־� 1�и� �Ѳ��� �ݰ� ������.");
		tv1.setGravity(Gravity.CENTER_HORIZONTAL);
		howto.addView(tv);
		howto.addView(tv1);
	}

	private void steamedpork()
	{
		tv[0].setText("��������ġ��");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedpork);
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
			if (arr.get(i).equals("���߱�ġ"))
			{
				tv[2].setText("���߱�ġ");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("���߱�ġ");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. �������� ���� �غ��ؼ� �Ա� ���� ũ��� �ﰢ�� ������� ���.");
		tv[4].setText("2. ���� ������⿡ ���߱⸧, ����, ���� ��, ���� ����, ���尡��, ������, �ұ��� �ְ� �������� ���� ����.");
		tv[5].setText("3. ���߱�ġ�� ������ �ִ� ä�� ��°�� �غ��Ѵ�. ���Ĵ� 4�� ���̷� �丷���� ���η� ���� ������.");
		tv[6].setText("4. ���� ����� ������⸦ �ְ� ���ٰ� ��ġ�� ���ĸ� �ø��� �Ҷ߹��� �ξ� ���.");
		tv[7].setText("5. ��ġ�� ������ �Ͱ� ��������� ���� ������ �ұ����� ���� �ؼ� �ѼҲ� �� ���� ������ ó���� �������� �Ǹ� �ҿ��� ������.");
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
		tv[0].setText("�����");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedegg);
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
			if (arr.get(i).equals("�ٽø�"))
			{
				tv[2].setText("�ٽø�");
				tv[2].setTextColor(Color.BLUE);
				break;
			}
			else
			{
				tv[2].setText("�ٽø�");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. �ٽø��� ���� �� ���� ���� �� ������ �ְ� ������ ���� �� �ٽø��� �������ϴ�.");
		tv[4].setText("2. ��� 4���� �ұ��� �ְ� 7~8�� ���� �� �� ���������� �� ���� ����� ���� �� ü�� �ѹ� �Ÿ��ϴ�.");
		tv[5].setText("3. ����� �ٽø� �� 2�� �־� ���� �� �� �׸��� ��� �� ���� ������ ���� ���Դϴ�.");
		tv[6].setText("4. �� ���� �� �׸��� ���� ��� ������ ���� �װ� ���� ������ �� �׸��� �־� �߰� �ҿ��� 20�� ���� �������� ��ϴ�.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}
}
