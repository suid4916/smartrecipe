package com.example.smartrecipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import com.example.smartrecipe.GCMIntentService;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gcm.GCMRegistrar;

public class MainActivity extends Activity implements OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button menu = (Button) findViewById(R.id.viewmenu);
		menu.setOnClickListener(this);
		Button refriger = (Button) findViewById(R.id.viewrefriger);
		refriger.setOnClickListener(this);
		Button inputpersonal = (Button) findViewById(R.id.viewdiet);
		inputpersonal.setOnClickListener(this);
		Button setting = (Button) findViewById(R.id.setting);
		setting.setOnClickListener(this);
		registGCM();
	}

	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		File file = new File(Environment.getExternalStorageDirectory()
				.getAbsolutePath() + "/personal.txt");
		//Handler h = new Handler();
		
		if (v.getId() == R.id.viewmenu)
		{
			try
			{
				new TCP_Client(MainActivity.this).execute().get();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ExecutionException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Intent init = new Intent(this, ViewRecipe.class);
			startActivity(init);
			
		}
		else if (v.getId() == R.id.viewrefriger)
		{
			try
			{
				new TCP_Client(MainActivity.this).execute().get();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ExecutionException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Intent init = new Intent(this, RefrigerView.class);
			startActivity(init);
		}
		else if (v.getId() == R.id.viewdiet)
		{
			if (!file.exists())
			{
				Intent init = new Intent(this, InputPersonal.class);
				startActivity(init);
			}
			else
			{
				try
				{
					BufferedReader buffer = new BufferedReader(
							new InputStreamReader(new FileInputStream(file)));
					String str;
					ArrayList<String> arr = new ArrayList<String>();
					boolean swit = true;
					while (swit)
					{
						if ((str = buffer.readLine()) != null)
						{
							arr.add(str);
							swit = true;
						}
						else
							swit = false;
					}
					buffer.close();
					for (int i = 0; i < arr.size(); i++)
					{
						if (arr.get(i).equals("´ç´¢"))
						{
							Intent init = new Intent(this, DiabetsDiet.class);
							startActivity(init);
						}
						else if (arr.get(i).equals("°íÇ÷¾Ð"))
						{
							Intent init = new Intent(this,
									HypertensionDiet.class);
							startActivity(init);
						}
					}
				}
				catch (FileNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (v.getId() == R.id.setting)
		{
			Intent init = new Intent(this, Setting.class);
			startActivity(init);
		}
	}

	private void registGCM()
	{
		GCMRegistrar.checkDevice(this);
		GCMRegistrar.checkManifest(this);

		final String regId = GCMRegistrar.getRegistrationId(this);
			GCMRegistrar.register(this, GCMIntentService.SERVER_ID);
			Toast toast = Toast.makeText(getApplicationContext(),
					"register complete", Toast.LENGTH_SHORT);
			toast.show();
			String regid = GCMRegistrar.getRegistrationId(this);
			File file = new File(Environment.getExternalStorageDirectory()
					.getAbsolutePath() + "/regid.txt");
			try
			{
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(regid.getBytes());
				fos.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
