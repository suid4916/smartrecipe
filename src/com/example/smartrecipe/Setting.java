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
		alert.setMessage("정말로 개인 데이터를 지우시겠습니까?\n (개인 데이터를 지우시면 식단 추천기능을 사용할 수 없습니다.)");
		alert.setCancelable(true);
		alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				File file = new File(Environment.getExternalStorageDirectory()
						.getAbsolutePath() + "/personal.txt");
				if(file.exists()){
					file.delete();
					Toast toast = Toast.makeText(getApplicationContext(), "삭제되었습니다", Toast.LENGTH_SHORT);
					toast.show();
				}else{
					Toast toast = Toast.makeText(getApplicationContext(), "파일이 없습니다!", Toast.LENGTH_SHORT);
					toast.show();
				}
			}
		});
		alert.setNegativeButton("취소",null);
		alert.show();
	}
}
