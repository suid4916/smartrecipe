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
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DiabetsDiet extends Activity {
	public int[] counter = new int[6];
	int j = 0;
	String temp[] = new String[6];
	TableLayout table;
	TableRow rowtable;
	TextView[] Menu = new TextView[15];
	TableRow.LayoutParams params1;
	TableRow.LayoutParams params2;
	TableRow[] row = new TableRow[15];
	TextView[] padding = new TextView[15];

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.diabetesdiet);
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
				if (arr.get(i).equals("¾Æ¿í")) {
					counter[0]++;
				} else if (arr.get(i).equals("ºñÁö")) {
					counter[0]++;
				} else if (arr.get(i).equals("¿ÀÂ¡¾î")) {
					counter[0]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("¼Ò°í±â")) {
					counter[1]++;
				} else if (arr.get(i).equals("±Ù´ë")) {
					counter[1]++;
				} else if (arr.get(i).equals("ºÏ¾î")) {
					counter[1]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("Ã»±¹Àå")) {
					counter[2]++;
				} else if (arr.get(i).equals("È£¹Ú")) {
					counter[2]++;
				} else if (arr.get(i).equals("ÆÄ·¡ÀÚ¹Ý")) {
					counter[2]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("¼Ò°í±â")) {
					counter[3]++;
				} else if (arr.get(i).equals("ÂüÄ¡Âî°³")) {
					counter[3]++;
				} else if (arr.get(i).equals("µ¿ÅÂ")) {
					counter[3]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("±¼")) {
					counter[4]++;
				} else if (arr.get(i).equals("´ß°í±â")) {
					counter[4]++;
				} else if (arr.get(i).equals("½Ã±ÝÄ¡")) {
					counter[4]++;
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals("¹«Ã»")) {
					counter[5]++;
				} else if (arr.get(i).equals("È£¹Ú")) {
					counter[5]++;
				} else if (arr.get(i).equals("»ç°ñ")) {
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
		int temp =3;
		TextView inform = (TextView)findViewById(R.id.diabetsinform);
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
		timer.setTextSize(17);
		timer.setLayoutParams(params1);
		content.setText("¸Þ´º");
		content.setTextSize(17);
		content.setLayoutParams(params2);
		rowtable.addView(timer);
		rowtable.addView(content);
		table.addView(rowtable);
	}

	public void setfirstday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("¾Æ¿íµÈÀå±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("µ¿±×¶û¶¯");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("µµ¶óÁö³ª¹°");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¸ðµë¹ö¼¸ººÀ½");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("ÄáºñÁöÂî°³");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("¼Ò°í±â¾ßÃ¤ººÀ½");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¹®¾î¹Ù´ÃÂÐººÀ½");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		Menu[9].setText("µÎºÎÀü");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		padding[10].setText("Àú³á");
		Menu[10].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("¿ÀÂ¡¾îÄá³ª¹°±¹");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("µÎ·çÄ¡±â");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("ºê·ÎÄÃ¸®,ÃÊÀå");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);

		Menu[14].setText("ºÎÃßÀü");
		row[14].addView(padding[14]);
		row[14].addView(Menu[14]);
		table.addView(row[14]);
	}

	public void setsecondday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("À°°³Àå");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("°íµî¾îÁ¶¸²");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("°ïµå·¹³ª¹°");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¶¥ÄáÁ¶¸²");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("±Ù´ëµÈÀå±¹");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("µÅÁö¼öÀ°");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¹ö¼¸Ã¤¼ÒººÀ½");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		Menu[9].setText("¹«»ýÃ¤");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		padding[10].setText("Àú³á");
		Menu[10].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("°è¶õºÏ¾î±¹");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("¿À¸®¾ßÃ¤ººÀ½");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("¿¬µÎºÎÂò");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);

		Menu[14].setText("½Ã·¹±â¹«Ä§");
		row[14].addView(padding[14]);
		row[14].addView(Menu[14]);
		table.addView(row[14]);
	}

	public void setthirdday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("Ã»±¹Àå");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("µ¿ÅÂÆ÷Àü");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("Ä«·¹¿¬±ÙÀü");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("½Ã±ÝÄ¡³ª¹°");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("È£¹Ú»õ¿ìÁ£±¹");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("»ý¼±±î½º");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("°í±¸¸¶ÁÙ±âººÀ½");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		Menu[9].setText("¿ÀÀÌ,¹«ÃÊÀýÀÓ");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		padding[10].setText("Àú³á");
		Menu[10].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("ÆÄ·¡±¼±¹");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("Á¦À°ººÀ½");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("¹¬¹«Ä§");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);

		Menu[14].setText("°í»ç¸®³ª¹°");
		row[14].addView(padding[14]);
		row[14].addView(Menu[14]);
		table.addView(row[14]);
	}

	public void setforthday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("¼Ò°í±â¹«±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("°¡ÀÚ¹ÌÁ¶¸²");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("°è¶õºê·ÎÄÝ¸®½ºÅ©·¥ºí");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¹«³ª¹°");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("ÂüÄ¡Âî°³");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("µ·±î½º");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("Ãë³ª¹°");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		Menu[9].setText("³ë°¢»ýÃ¤");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		padding[10].setText("Àú³á");
		Menu[10].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("µ¿ÅÂÂî°³");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("°¡Áö³ª¹°");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("µ·À°Ç¥°í¹ö¼¸Àü");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);

		Menu[14].setText("µÎºÎ¾¦°«³ª¹°");
		row[14].addView(padding[14]);
		row[14].addView(Menu[14]);
		table.addView(row[14]);
	}

	public void setfifthday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("±¼¹Ì¿ª±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("Á¶±â±¸ÀÌ");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("µé±ú¿ì¾û¹«Ä§");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("Äá³ª¹°¹«Ä§");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("´ß°èÀå");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("µ¿ÅÂÂò");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("¸êÄ¡²Ê¸®°íÃßººÀ½");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		Menu[9].setText("ÅÁÆòÃ¤");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		padding[10].setText("Àú³á");
		Menu[10].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("½Ã±ÝÄ¡Á¶°³µÈÀå±¹");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("¿ÀÂ¡¾î¾ßÃ¤ººÀ½");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("°¡Áö³ª¹°");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);

		Menu[14].setText("ºê·ÎÄÝ¸®¼÷È¸");
		row[14].addView(padding[14]);
		row[14].addView(Menu[14]);
		table.addView(row[14]);
	}

	public void setsixthday() {
		padding[0].setText("¾ÆÄ§");
		Menu[0].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[0].addView(padding[0]);
		row[0].addView(Menu[0]);
		table.addView(row[0]);

		Menu[1].setText("½Ã·¹±â±¹");
		row[1].addView(padding[1]);
		row[1].addView(Menu[1]);
		table.addView(row[1]);

		Menu[2].setText("¼Ò°í±âÇ¥°í¹ö¼¸Àü");
		row[2].addView(padding[2]);
		row[2].addView(Menu[2]);
		table.addView(row[2]);

		Menu[3].setText("ºÎÃßÀü");
		row[3].addView(padding[3]);
		row[3].addView(Menu[3]);
		table.addView(row[3]);

		Menu[4].setText("¿ÀÀÌººÀ½");
		row[4].addView(padding[4]);
		row[4].addView(Menu[4]);
		table.addView(row[4]);

		padding[5].setText("Á¡½É");
		Menu[5].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[5].addView(padding[5]);
		row[5].addView(Menu[5]);
		table.addView(row[5]);

		Menu[6].setText("È£¹ÚµÈÀåÂî°³");
		row[6].addView(padding[6]);
		row[6].addView(Menu[6]);
		table.addView(row[6]);

		Menu[7].setText("¿ÀÂ¡¾î¼÷È¸");
		row[7].addView(padding[7]);
		row[7].addView(Menu[7]);
		table.addView(row[7]);

		Menu[8].setText("Âü³ª¹°");
		row[8].addView(padding[8]);
		row[8].addView(Menu[8]);
		table.addView(row[8]);

		Menu[9].setText("±è¹«Ä§");
		row[9].addView(padding[9]);
		row[9].addView(Menu[9]);
		table.addView(row[9]);

		padding[10].setText("Àú³á");
		Menu[10].setText("Çö¹Ìº¸¸®Àâ°î¹ä");
		row[10].addView(padding[10]);
		row[10].addView(Menu[10]);
		table.addView(row[10]);

		Menu[11].setText("°õ±¹");
		row[11].addView(padding[11]);
		row[11].addView(Menu[11]);
		table.addView(row[11]);

		Menu[12].setText("¼ÒºÒ°í±â");
		row[12].addView(padding[12]);
		row[12].addView(Menu[12]);
		table.addView(row[12]);

		Menu[13].setText("È£¹ÚÀü");
		row[13].addView(padding[13]);
		row[13].addView(Menu[13]);
		table.addView(row[13]);

		Menu[14].setText("¾ßÃ¤°è¶õÂò");
		row[14].addView(padding[14]);
		row[14].addView(Menu[14]);
		table.addView(row[14]);
	}
}
