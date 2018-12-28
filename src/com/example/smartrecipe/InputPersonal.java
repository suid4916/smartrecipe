package com.example.smartrecipe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class InputPersonal extends Activity implements OnClickListener {
	Spinner spinner;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.illness, android.R.layout.simple_spinner_item);
		spinner = (Spinner) findViewById(R.id.illness);
		spinner.setAdapter(adapter);
		Button save = (Button) findViewById(R.id.save);
		save.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			File file = new File(Environment.getExternalStorageDirectory()
					.getAbsolutePath() + "/personal.txt");
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			EditText et_name = (EditText) findViewById(R.id.edit_name);
			String str_name = et_name.getText().toString()+"\n";
			RadioGroup rg_sex = (RadioGroup) findViewById(R.id.radiogroup_sex);
			RadioButton rb_male = (RadioButton) findViewById(R.id.male);
			RadioButton rb_female = (RadioButton) findViewById(R.id.female);
			String str_sex = "";
			if (rg_sex.getCheckedRadioButtonId() == R.id.male)
				str_sex = rb_male.getText().toString()+"\n";
			else if (rg_sex.getCheckedRadioButtonId() == R.id.female)
				str_sex = rb_female.getText().toString()+"\n";
			String spn_illness = spinner.getSelectedItem().toString()+"\n";
			fos.write(str_name.getBytes());
			fos.write(str_sex.getBytes());
			fos.write(spn_illness.getBytes());
			fos.close();
			Toast.makeText(this,"saved", Toast.LENGTH_SHORT).show();
			finish();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
