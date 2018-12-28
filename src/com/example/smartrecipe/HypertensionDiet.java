package com.example.smartrecipe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class HypertensionDiet extends Activity {
	public int[] counter = new int[6];
	int j = 0;
	String temp[] = new String[6];
	TableLayout table;
	TableRow rowtable;
	TextView[] Menu = new TextView[14];
	TableRow.LayoutParams params1;
	TableRow.LayoutParams params2;
	TableRow[] row = new TableRow[14];
	TextView[] padding = new TextView[14];

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.hypertensiondiet);
		table = (TableLayout) findViewById(R.id.diabetesdiet);
		rowtable = new TableRow(this);
		initialtext();
		setMax();
		setMenu();
	}

	public void setMax() {
		try {
			BufferedReader bufferReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(Environment
							.getExternalStorageDirectory().getAbsolutePath()
							+ "/test.txt"), "UTF-8"));
			String str;
			ArrayList<String> arr = new ArrayList<String>();
			boolean swit = true;
			while (swit) {
				if ((str = bufferReader.readLine()) != null) {
					arr.add(str);
					swit = true;
				} else
					swit = false;
			}
			bufferReader.close();
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("�̿�")) {
					counter[0]++;
				} else if (arr.get(i).equals("�Ҹ�")) {
					counter[0]++;
				} else if (arr.get(i).equals("û����")) {
					counter[0]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("�κ�")) {
					counter[1]++;
				} else if (arr.get(i).equals("�Ļ�")) {
					counter[1]++;
				} else if (arr.get(i).equals("���κ�")) {
					counter[1]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("�ᳪ��")) {
					counter[2]++;
				} else if (arr.get(i).equals("���İ�Ƽ")) {
					counter[2]++;
				} else if (arr.get(i).equals("����")) {
					counter[2]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("��Ÿ������")) {
					counter[3]++;
				} else if (arr.get(i).equals("�Ļ�")) {
					counter[3]++;
				} else if (arr.get(i).equals("����")) {
					counter[3]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("�Ͼ�")) {
					counter[4]++;
				} else if (arr.get(i).equals("�޹и�")) {
					counter[4]++;
				} else if (arr.get(i).equals("�κ�")) {
					counter[4]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("��")) {
					counter[5]++;
				} else if (arr.get(i).equals("�޹и�")) {
					counter[5]++;
				} else if (arr.get(i).equals("����")) {
					counter[5]++;
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setMenu() {
		int temp = 3;
		TextView inform = (TextView) findViewById(R.id.hypertensionimform);
		for (int i = 0; i < 4; i++) {
			if (counter[0] == temp) {
				setfirstday();
				inform.setText("1��");
				break;
			} else if (counter[1] == temp) {
				setsecondday();
				inform.setText("2��");
				break;
			} else if (counter[2] == temp) {
				setthirdday();
				inform.setText("3��");
				break;
			} else if (counter[3] == temp) {
				setforthday();
				inform.setText("4��");
				break;
			} else if (counter[4] == temp) {
				setfifthday();
				inform.setText("5��");
				break;
			} else if (counter[5] == temp) {
				setsixthday();
				inform.setText("6��");
				break;
			}
			temp--;
		}
	}

	public void initialtext() {
		TextView timer = new TextView(this);
		TextView content = new TextView(this);
		params1 = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT, 0.2f);
		params2 = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT, 1.0f);
		for (int i = 0; i < Menu.length; i++) {
			Menu[i] = new TextView(this);
			Menu[i].setLayoutParams(params2);
			row[i] = new TableRow(this);
			padding[i] = new TextView(this);
			padding[i].setLayoutParams(params1);
		}
		timer.setText("�Ļ�");
		timer.setLayoutParams(params1);
		content.setText("�޴�");
		content.setLayoutParams(params2);
		rowtable.addView(timer);
		rowtable.addView(content);
		table.addView(rowtable);
	}

	public void setfirstday() {
		padding[0].setText("��ħ");
		Menu[0].setText("����");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("�̿���");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("����߱�ġ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("�÷��⺺��");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("��ġ����");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("����");
		Menu[5].setText("�ᱹ��");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("���̹�ħ");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("���߸���4��");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("����ٴ��к���");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("����");
		Menu[9].setText("����");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("û����");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("�Ѱ���ġ");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("��������ħ");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("��ġ����");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setsecondday() {
		padding[0].setText("��ħ");
		Menu[0].setText("����");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("�κ��屹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("��ġ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("�ķ���ħ");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("����ħ");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("����");
		Menu[5].setText("�佺Ʈ");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("����߻�����");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("�ް�������");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("���������");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("����");
		Menu[9].setText("����");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("���κ��");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("��ġ");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("���ڹ�");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("�����");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setthirdday() {
		padding[0].setText("��ħ");
		Menu[0].setText("����");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("�ᳪ����");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("�߹��߱�ġ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("�볪������");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("���������");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("����");
		Menu[5].setText("���İ�Ƽ");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("��ġ");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("����Ʈ��Ŭ");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("���߸���4��");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("����");
		Menu[9].setText("����");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("�����");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("�Ѱ���ġ");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("�ñ�ġ��ħ");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("�����칫ħ");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setforthday() {
		padding[0].setText("��ħ");
		Menu[0].setText("����");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("�������屹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("��ġ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("�̿��ʹ�ħ");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("����ħ");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("����");
		Menu[5].setText("�佺Ʈ");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("����߻�����");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("�ް�������");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("���������");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("����");
		Menu[9].setText("����");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("�����");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("��ġ");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("���ڹ�");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("��ġ����");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setfifthday() {
		padding[0].setText("��ħ");
		Menu[0].setText("����");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("�Ͼ�̿���");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("����߱�ġ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("�ᳪ����ħ");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("��ġ����");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("����");
		Menu[5].setText("�޹б���");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("��ġ");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("����");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("���̹�ħ");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("����");
		Menu[9].setText("����");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("�κ��");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("�Ѱ���ġ");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("��������ħ");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("��ġ����");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setsixthday() {
		padding[0].setText("��ħ");
		Menu[0].setText("����");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("����");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("��������");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("��������ä");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("�ް���");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("����");
		Menu[5].setText("�޹б���");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("��ġ");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("����");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("���̹�ħ");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("����");
		Menu[9].setText("����");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("���߱�");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("����߱�ġ");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("�κ���");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("��������");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}
}
