package com.example.smartrecipe;

import java.io.File;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class Setting extends Activity implements OnClickListener{
	public void onCreate(Bundle savedBundle){
		super.onCreate(savedBundle);
		setContentView(R.layout.setting);
		TextView setting = (TextView)findViewById(R.id.removepersonal);
		setting.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setMessage("������ ���� �����͸� ����ðڽ��ϱ�?\n (���� �����͸� ����ø� �Ĵ� ��õ����� ����� �� �����ϴ�.)");
		alert.setCancelable(true);
		alert.setPositiveButton("Ȯ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				File file = new File(Environment.getExternalStorageDirectory()
						.getAbsolutePath() + "/personal.txt");
				if(file.exists()){
					file.delete();
					Toast toast = Toast.makeText(getApplicationContext(), "�����Ǿ����ϴ�", Toast.LENGTH_SHORT);
					toast.show();
				}else{
					Toast toast = Toast.makeText(getApplicationContext(), "������ �����ϴ�!", Toast.LENGTH_SHORT);
					toast.show();
				}
			}
		});
		alert.setNegativeButton("���",null);
		alert.show();
	}
}
