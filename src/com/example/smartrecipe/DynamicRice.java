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
import android.widget.Toast;

public class DynamicRice extends Activity
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
			e.printStackTrace();
		}
	//	Toast toast = Toast.makeText(this,arr.get(0), Toast.LENGTH_SHORT);
	//	toast.show();
		select();
	}
	public void select(){
		if(result.equals("whiterice")){
			whiteRice();
		}else if(result.equals("peasrice")){
			peasRice();
		}else if(result.equals("steamedrice")){
			steamedRice();
		}else if(result.equals("chestnutrice")){
			chestnutRice();
		}else if(result.equals("potatorice")){
			potatoRice();
		}else if(result.equals("sweetpotatorice")){
			sweetpotatoRice();
		}else if(result.equals("mushroomrice")){
			mushroomRice();
		}else if(result.equals("gondeurerice")){
			gondeureRice();
		}else if(result.equals("beansproutrice")){
			beansproutRice();
		}
	}
	public void whiteRice(){
		tv[0].setText("»ÚΩ“π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.whiterice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		tv[3].setText("1. Ω“ø° π∞¿ª √Ê∫–»˜ ∫◊∞Ì ¿Áª°∏Æ ºØæÓº≠ πŸ∑Œ π∞¿ª µ˚∂Û πˆ∏Æ∞Ì »˚¿÷∞‘ ∫Ò∫≠ π∞¿Ã ∏ºæ∆¡˙ ∂ß±Ó¡ˆ º≠≥  ¬˜∑  «Û±∫¥Ÿ.");
		tv[4].setText("2. π∞¿ª √Ê∫–»˜ ∫◊∞Ì ø©∏ßø°¥¬ 30∫–, ∞‹øÔø°¥¬ 2Ω√∞£ ¡§µµ ∫“∏∞ ¥Ÿ¿Ω º“ƒÌ∏Æø° ΩÒæ∆º≠ π∞±‚∏¶ ª´¥Ÿ.");
		tv[5].setText("3. º‹ø° Ω“¿ª ¥„∞Ì ∫–∑Æ¿« π∞¿ª ∫ŒæÓ ¡ﬂ∫“ø°º≠ Ω√¿€«œø© æ‡«— ∫“∑Œ ¡Ÿ¿Ã∞Ì ≥—ƒ°¡ˆ æ ¿ª ¡§µµ∑Œ 4~5∫– ≤˙∞‘ ≥ˆµ–¥Ÿ.");
		tv[6].setText("4. ∫“¿ª æ∆¡÷ æ‡«œ∞‘ «œø© 15∫– ¡§µµ ¿Õ»˜∞Ì ∫“¿ª ≤Ù±‚ ¿¸ø° 5√  ¡§µµ ºæ∫“∑Œ ø©∫–¿« ºˆ∫–¿ª ≥Ø∑¡ ∫∏≥Ω »ƒ ∫“¿ª ≤ˆ¥Ÿ.");
		tv[7].setText("5. ∂—≤±¿ª µ§¿∫ √§∑Œ 10~15∫– ¡§µµ ∂‰¿ª µÈ¿Œ ¥Ÿ¿Ω ¿ßæ∆∑°∏¶ ¿ﬂ ºØæÓ ¡ÿ¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		howto.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	public void peasRice(){
		tv[0].setText("øœµŒƒ·π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.peasrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("øœµŒƒ·")){
				tv[3].setText("øœµŒƒ·");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("øœµŒƒ·");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. Ω“∞˙ ∞À¡§ƒ·¿ª π∞ø° æ‡ 30∫– ¡§µµ ∫“∏∞¥Ÿ.");
		tv[5].setText("2. ∫“∏∞ Ω“∞˙ øœµŒƒ·ø° ∫–∑Æ¿« π∞¿ª ∫◊∞Ì π‰¿ª ¡˛¥¬¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}
	public void steamedRice(){
		tv[0].setText("∆œπ‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.steamedrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("∆œ")){
				tv[3].setText("∆œ");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("∆œ");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. Ω“∞˙ ∞À¡§ƒ·¿ª π∞ø° æ‡ 30∫– ¡§µµ ∫“∏∞¥Ÿ.");
		tv[5].setText("2. ∫“∏∞ Ω“∞˙ ∆œø° ∫–∑Æ¿« π∞¿ª ∫◊∞Ì π‰¿ª ¡˛¥¬¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
	}
	public void chestnutRice(){
		tv[0].setText("π„π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.chestnutrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π„")){
				tv[3].setText("π„");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("π„");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. Ω“¿∫ ±˙≤˝¿Ã æƒæÓ √Ê∫–»˜ ¿·±‚µµ∑œ π∞¿ª ∫◊∞Ì 1~2Ω√∞£ ¡§µµ ∫“∏∞¥Ÿ.");
		tv[5].setText("2. π„¿∫ ≤Æ¡˙¿ª ±˙≤˝¿Ã π˛∞‹ ≈´ ∞Õ¿∫ 4µÓ∫–, ¿€¿∫ ∞Õ¿∫ 2µÓ∫– «œø© ªˆ¿Ã ∫Ø«œ¡ˆ æ ∞‘ º”∂ﬂπ∞ø° ¥„∞°µ–¥Ÿ.");
		tv[6].setText("3. πÿ¿Ã µŒ≈˘«— ≥ø∫Ò≥™ º‹ø° ∫“∑¡ µ– Ω“∞˙ π„¿ª ºØæÓ æ»ƒ°∞Ì, Ω“¿ª ∫“∏∞ 1¿« π∞∑Œ π‰π∞¿ª ∫◊∞Ì º“±›¿ª ∞£«—¥Ÿ.");
		tv[7].setText("4. √≥¿Ωø° ºæ ∫“ø°º≠ ≤˙¿Ã¥Ÿ∞° øÏ∏£∏£ ≤˙æÓø¿∏£∏È ¡ﬂ∫“∑Œ ¡Ÿø© ¿⁄¿€¿⁄¿€«œ∞‘ ≤˙¿Œ¥Ÿ.");
		tv[8].setText("5. π‰π∞¿Ã √Ê∫–»˜ ≤˙æÓ πŸΩœ ¡πæ∆µÂ¥¬ º“∏Æ∞° ≥™∏È ∫“¿ª æ‡«œ∞‘ ¡Ÿ¿Ã∞Ì 10∫– ¡§µµ ∂‰¿ª «´ µÈ¿Œ¥Ÿ.");
		tv[9].setText("6. π„¿Ã ∞Ì∑Á ºØ¿Ãµµ∑œ ¡÷∞∆¿∏∑Œ ¿ßæ∆∑°∏¶ ∞°∫±∞‘ ≈–∏Èº≠ ºØ¿∫ µ⁄ ¥≠∏Æ¡ˆ æ ∞‘ π‰±◊∏©ø° ¥„¥¬¥Ÿ.");
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
	public void potatoRice(){
		tv[0].setText("∞®¿⁄π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.potatorice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("∞®¿⁄")){
				tv[3].setText("∞®¿⁄");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("∞®¿⁄");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. Ω“¿∫ ¿œæÓº≠ æ‡ 30∫–∞£ ∫“∑¡µŒ∞Ì ∞®¿⁄¥¬ æƒæÓº≠ ≤Æ¡˙¿ª π˛±‚∞Ì ≈Î¬∞∑Œ π∞ø° ≥÷∞Ì ªÓ¥¬¥Ÿ.");
		tv[5].setText("2. ∞®¿⁄∞° ∞≈¿« π∞∑∂¿ª ¡Ó¿Ω ∫“∏∞ Ω“¿ª ≥÷∞Ì π‰¿ª ¡˛¥¬¥Ÿ.");
		tv[6].setText("3. ¿Ã∂ß π∞¿Ã ∫Œ¡∑«œ∏È Ω“¿Ã ¿Õ¿ª ∏∏≈≠¿« π∞¿ª ∫∏√Ê«œ∞Ì ∂‰¿ª ¿ﬂ µÈø©º≠ π∞±‚∞° øœ¿¸»˜ ∞≈µŒæÓ¡ˆ∏È ∞®¿⁄∏¶ ¡÷∞∆¿∏∑Œ ¿∏±˙∏Èº≠ ºØ¥¬¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
	}
	public void sweetpotatoRice(){
		tv[0].setText("∞Ì±∏∏∂π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.sweetpotatorice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("∞Ì±∏∏∂")){
				tv[3].setText("∞Ì±∏∏∂");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("∞Ì±∏∏∂");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ∞Ì±∏∏∂¥¬ ≤Æ¡˙¿ª π˛∞‹º≠ ±Ω¿∫ ±ÔµŒ±‚ ∏æÁ¿∏∑Œ Ω‰æÓ ¬˘π∞∑Œ «— π¯ «Û±≈ π∞¿ª ª´¥Ÿ.");
		tv[5].setText("2. Ω“¿∫ æƒæÓ 30∫– ¡§µµ ∫“∏∞ »ƒ π∞±‚∏¶ ª´¥Ÿ.");
		tv[6].setText("3. Ω“∞˙ ∞Ì±∏∏∂∏¶ ºØæÓº≠ º‹ø° æ»ƒ°∞Ì π‰π∞¿ª ∫ŒæÓ ≤˙¿Œ¥Ÿ.");
		tv[7].setText("4. ≤˙æÓø¿∏£∏È ¡ﬂ∫“∑Œ ¡Ÿ¿Ã∞Ì Ω“æÀ¿Ã ∆€¡ˆ∏È ∫“¿ª æ‡«œ∞‘ «œø© ∂‰¿ª µÈ¿Œ »ƒ ¿ﬂ ºØ¥¬ ¥Ÿ.");
		tv[8].setText("5. »´∞Ì√ﬂ, «≤∞Ì√ﬂ¥¬ ææ∏¶ ª©∞Ì ±Ω∞‘ ¥Ÿ¡Æº≠ ¡¯∞£¿Â, ∞Ì√Â∞°∑Á, ±˙º“±›, ¬¸±‚∏ß¿∏∑Œ æÁ≥‰¿Â¿ª ∏∏µÈæÓ ∞ÁµÈ¿Œ¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void mushroomRice(){
		tv[0].setText("«•∞Ìπˆº∏π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.mushroomrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("«•∞Ìπˆº∏")){
				tv[3].setText("«•∞Ìπˆº∏");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("«•∞Ìπˆº∏");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. «•∞Ìπˆº∏¿∫ πÃ¡ˆ±Ÿ«— π∞ø° ∫“∑¡º≠ ±‚µ’¿ª ∂º∞Ì ±Ω∞‘ √§ Ω‰æÓ µ–¥Ÿ.");
		tv[5].setText("2. Ω“¿∫ π‰ ¡˛±‚ 30∫– ¿¸ø° æƒæÓ √Ê∫–»˜ ∫“∏∞ »ƒø° π∞±‚∏¶ ª´¥Ÿ.");
		tv[6].setText("3. Ω“∞˙ «•∞Ìπˆº∏¿ª ºØæÓ º‹ø° æ»ƒ°∞Ì π‰π∞¿ª ∫ŒæÓ ≤˙¿Œ¥Ÿ.");
		tv[7].setText("4. ≤˙æÓø¿∏£∏È ¡ﬂ∫“∑Œ ¡Ÿ¿Ã∞Ì √§ Ω‰æÓ ≥ı¿∫ »£π⁄¿ª ¿ßø° æÒ∞Ì ∂‰¿ª µÈ¿Œ »ƒ ¿ß æ∆∑°∑Œ¿ﬂ ºØæÓ¡ÿ¥Ÿ.");
		tv[8].setText("5. »´∞Ì√ﬂ «≤∞Ì√ﬂ ææ∏¶ ª©∞Ì, ±Ω∞‘ ¥Ÿ¡Æº≠ ¡¯∞£¿Â, ±˙º“±›, ∞Ì√Â∞°∑Á, ¬¸±‚∏ß¿∏∑Œ æÁ≥‰¿Â¿ª∏∏µÈæÓ ∞ÁµÈ¿Œ¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
		howto.addView(tv[8]);
	}
	public void gondeureRice(){
		tv[0].setText("∞ÔµÂ∑ππ‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.gondeurerice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("∞ÔµÂ∑π")){
				tv[3].setText("∞ÔµÂ∑π");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("∞ÔµÂ∑π");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. ∞ÔµÂ∑π¥¬ ≤˙¥¬ π∞ø° ªÓæ∆ ∞«¡Æ ≥ı¿∫ »ƒø° ∏‘±‚ ¡¡¿∫ ≈©±‚∑Œ Ω‰æÓ ≥ı¥¬¥Ÿ.");
		tv[5].setText("2. Ω“¿ª π∞ø° ∫“∑¡ ±˙≤˝¿Ã æƒ¥¬¥Ÿ.");
		tv[6].setText("3. ªÓæ∆ ≥ı¿∫ ∞ÔµÂ∑π≥™π∞ø° º“±›, µÈ±‚∏ß, ≈Î±˙∏¶ ≥÷∞Ì πˆπ´∏∞¥Ÿ.");
		tv[7].setText("4. ∞ÔµÂ∑π≥™π∞¿ª º‹ πÿø° ±Ú∞Ì Ω“¿ª ¿ßø° ≥÷æÓ π∞¿ª ∫◊∞Ì π‰¿ª ¡˛¥¬¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
	public void beansproutRice(){
		tv[0].setText("ƒ·≥™π∞π‰");
		tv[0].setTextSize(20);
		title.addView(tv[0]);
		iv.setBackgroundResource(R.drawable.beansproutrice);
		image.addView(iv);
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("Ω“")){
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.BLUE);
				break;
			}else{
				tv[1].setText("Ω“");
				tv[1].setTextColor(Color.RED);
			}
		}for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("π∞")){
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.BLUE);
				break;
			}else{
				tv[2].setText("π∞");
				tv[2].setTextColor(Color.RED);
			}
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("ƒ·≥™π∞")){
				tv[3].setText("ƒ·≥™π∞");
				tv[3].setTextColor(Color.BLUE);
				break;
			}else{
				tv[3].setText("ƒ·≥™π∞");
				tv[3].setTextColor(Color.RED);
			}
		}
		tv[4].setText("1. Ω“¿∫ 3»∏ ∞°∑Æ ±˙≤˝¿Ã æƒæÓ ¿œæÓ 30∫–∞°∑Æ ∫“∏∞ »ƒ √ºø° πﬁ√ƒ π∞±‚∏¶ ª´¥Ÿ.");
		tv[5].setText("2. ƒ·≥™π∞¿∫ ¥ŸµÎæÓ æƒæÓ ∞«¡Æ π∞±‚∏¶ ª´¥Ÿ.");
		tv[6].setText("3. Ω“∞˙ ƒ·≥™π∞¿ª ∞¢∞¢ π›¿∏∑Œ ≥™¥©æÓ π‰º‹ø° ∏’¿˙ Ω“¿ª æ»ƒ°∞Ì ¥ŸΩ√ π›∫π«œø© Ω“∞˙ ƒ·≥™π∞¿ª æÒ¥¬¥Ÿ.");
		tv[7].setText("4. 3ø° π‰π∞¿ª ∫ŒæÓ √≥¿Ωø°¥¬ ºæ ∫“ø° ø√∑¡ ≤˙æÓø¿∏£∏È ∫“¿ª ¡ﬂ∫“∑Œ «œø© Ω“æÀ¿Ã ∆€¡ˆ∏È ∫“¿ª æ‡«œ∞‘ «œ∞Ì ∂‰¿ª √Ê∫–»˜ µÈ¿Œ¥Ÿ.");
		list.addView(tv[1]);
		list.addView(tv[2]);
		list.addView(tv[3]);
		howto.addView(tv[4]);
		howto.addView(tv[5]);
		howto.addView(tv[6]);
		howto.addView(tv[7]);
	}
}
