package com.example.smartrecipe;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;

public class TCP_Client extends AsyncTask<Integer, String, Integer>
{
	Socket localSocket;
	int port = 55530;
	String server_ip = "210.119.32.233";
	SocketAddress addr = new InetSocketAddress(server_ip, port);
	private ProgressDialog dialog;
	private Context mcontext;
	public TCP_Client(Context context)
	{
		mcontext = context;
	}

	protected void onPreExecute()
	{
		dialog = new ProgressDialog(mcontext);
		dialog.setMessage("·ÎµùÁß");
		dialog.show();
		super.onPreExecute();
	}

	public void Connection()
	{
		try
		{
			File file = new File(Environment.getExternalStorageDirectory()
					.getAbsolutePath() + "/test.txt");
			file.createNewFile();
			localSocket = new Socket();
			localSocket.connect(addr, 2000);
			byte[] buf = new byte[1024];
			DataInputStream dis = new DataInputStream(localSocket.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			BufferedReader br = new BufferedReader(new InputStreamReader(localSocket.getInputStream()));
			while(true){
				int i=dis.read(buf);
				if(i==-1){
					bos.close();
					localSocket.close();
					break;
				}
				bos.write(buf,0,i);
				bos.flush();
			}
			br.close();
			/*BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
			String str;
			ArrayList<String> arr = new ArrayList<String>();
			while((str = br.readLine())!=null){
				arr.add(str);
			}
			br.close();
			File file2 = new File(Environment.getExternalStorageDirectory()
					.getAbsolutePath() + "/test.txt");
			FileWriter fos2 = new FileWriter(file2);
			byte[] euc = new byte[1024];
			String arga;
			for(int i=0;i<arr.size();i++){
				euc = (arr.get(i).getBytes("utf-8"));
				arga = new String((euc),"utf-8");
				fos2.flush();
			}
			fos2.close();
			file.delete();*/
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		dialog.dismiss();
	}

	@Override
	protected Integer doInBackground(Integer... params)
	{
		Connection();
		// TODO Auto-generated method stub
		return null;
	}
}
