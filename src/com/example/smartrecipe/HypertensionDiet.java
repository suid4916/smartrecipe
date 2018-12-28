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
				if (arr.get(i).equals("¹Ì¿ª")) {
					counter[0]++;
				} else if (arr.get(i).equals("¼Ò¸é")) {
					counter[0]++;
				} else if (arr.get(i).equals("Ã»±¹Àå")) {
					counter[0]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("µÎºÎ")) {
					counter[1]++;
				} else if (arr.get(i).equals("½Ä»§")) {
					counter[1]++;
				} else if (arr.get(i).equals("¼øµÎºÎ")) {
					counter[1]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("Äá³ª¹°")) {
					counter[2]++;
				} else if (arr.get(i).equals("½ºÆÄ°ÔÆ¼")) {
					counter[2]++;
				} else if (arr.get(i).equals("µÈÀå")) {
					counter[2]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("´ÀÅ¸¸®¹ö¼¸")) {
					counter[3]++;
				} else if (arr.get(i).equals("½Ä»§")) {
					counter[3]++;
				} else if (arr.get(i).equals("ºñÁö")) {
					counter[3]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("ºÏ¾î")) {
					counter[4]++;
				} else if (arr.get(i).equals("¸Þ¹Ð¸é")) {
					counter[4]++;
				} else if (arr.get(i).equals("µÎºÎ")) {
					counter[4]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("¹«")) {
					counter[5]++;
				} else if (arr.get(i).equals("¸Þ¹Ð¸é")) {
					counter[5]++;
				} else if (arr.get(i).equals("¹èÃß")) {
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
				inform.setText("1ÀÏ");
				break;
			} else if (counter[1] == temp) {
				setsecondday();
				inform.setText("2ÀÏ");
				break;
			} else if (counter[2] == temp) {
				setthirdday();
				inform.setText("3ÀÏ");
				break;
			} else if (counter[3] == temp) {
				setforthday();
				inform.setText("4ÀÏ");
				break;
			} else if (counter[4] == temp) {
				setfifthday();
				inform.setText("5ÀÏ");
				break;
			} else if (counter[5] == temp) {
				setsixthday();
				inform.setText("6ÀÏ");
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
		timer.setText("½Ä»ç");
		timer.setLayoutParams(params1);
		content.setText("¸Þ´º");
		content.setLayoutParams(params2);
		rowtable.addView(timer);
		rowtable.addView(content);
		table.addView(rowtable);
	}

	public void setfirstday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("¹Ì¿ª±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("¾ç¹èÃß±èÄ¡");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("½Ã·¡±âººÀ½");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¸êÄ¡ººÀ½");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Äá±¹¼ö");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("¿ÀÀÌ¹«Ä§");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("¸ÞÃß¸®¾Ë4°³");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¹®¾î¹Ù´ÃÂÐººÀ½");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("Àú³á");
		Menu[9].setText("Àâ°î¹ä");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("Ã»±¹Àå");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("ÃÑ°¢±èÄ¡");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("µµ¶óÁö¹«Ä§");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("»ïÄ¡±¸ÀÌ");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setsecondday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("µÎºÎÀå±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("±èÄ¡");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("ÆÄ·¡¹«Ä§");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("±¼¹«Ä§");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Åä½ºÆ®");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("¾ç¹èÃß»ø·¯µå");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("´Þ°¿ÇÁ¶óÀÌ");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("ÀúÁö¹æ¿ìÀ¯");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("Àú³á");
		Menu[9].setText("Àâ°î¹ä");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("¼øµÎºÎÂî°³");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("±èÄ¡");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("ÄáÀÚ¹Ý");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("°íµî¾î±¸ÀÌ");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setthirdday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("Äá³ª¹°±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("¾ß¹èÃß±èÄ¡");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("Ãë³ª¹°ººÀ½");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¹ð¾îÆ÷ººÀ½");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("½ºÆÄ°ÔÆ¼");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("±èÄ¡");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("½ºÀ§Æ®ÇÇÅ¬");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¸ÞÃß¸®¾Ë4°³");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("Àú³á");
		Menu[9].setText("Àâ°î¹ä");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("µÈÀåÂî°³");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("ÃÑ°¢±èÄ¡");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("½Ã±ÝÄ¡¹«Ä§");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("Á¶°¹»ì¹«Ä§");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setforthday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("¹ö¼¸µÈÀå±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("±èÄ¡");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("¹Ì¿ªÃÊ¹«Ä§");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("±¼¹«Ä§");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Åä½ºÆ®");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("¾ç¹èÃß»ø·¯µå");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("´Þ°¿ÇÁ¶óÀÌ");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("ÀúÁö¹æ¿ìÀ¯");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("Àú³á");
		Menu[9].setText("Àâ°î¹ä");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("ºñÁöÂî°³");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("±èÄ¡");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("ÄáÀÚ¹Ý");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("²ÇÄ¡±¸ÀÌ");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setfifthday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("ºÏ¾î¹Ì¿ª±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("¾ç¹èÃß±èÄ¡");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("Äá³ª¹°¹«Ä§");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¸êÄ¡ººÀ½");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("¸Þ¹Ð±¹¼ö");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("±èÄ¡");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("¶ô±³");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¿ÀÀÌ¹«Ä§");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("Àú³á");
		Menu[9].setText("Àâ°î¹ä");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("µÎºÎÂî°³");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("ÃÑ°¢±èÄ¡");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("µµ¶óÁö¹«Ä§");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("»ïÄ¡±¸ÀÌ");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}

	public void setsixthday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("¹«±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("¹«ÃÊÀýÀÌ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("µµ¶óÁö»ýÃ¤");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("´Þ°¿Âò");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("¸Þ¹Ð±¹¼ö");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("±èÄ¡");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("¶ô±³");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¿ÀÀÌ¹«Ä§");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		padding[9].setText("Àú³á");
		Menu[9].setText("Àâ°î¹ä");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		Menu[10].setText("¹èÃß±¹");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("¾ç¹èÃß±èÄ¡");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("µÎºÎÀü");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("°¡Áö³ª¹°");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);
	}
}
