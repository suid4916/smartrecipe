package com.example.smartrecipe;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.android.gcm.GCMBaseIntentService;

public class GCMIntentService extends GCMBaseIntentService{
	public static final String SERVER_ID = "970154619561";
	static final String TAG = "GCMIntentService";
	public GCMIntentService(){
		super(SERVER_ID);
	}
	@Override
	protected void onError(Context arg0, String arg1) {
		// TODO Auto-generated method stub
		Log.d(TAG, "onError. errorId : "+arg1);
	}
	@Override
	protected void onMessage(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		Log.i(TAG, "Received message");
        String message = arg1.getExtras().getString("ABS");
         
        // notifies user
        generateNotification(arg0, message);
	}
	@Override
	protected void onRegistered(Context arg0, String arg1) {
		// TODO Auto-generated method stub
        Log.d(TAG, "registered");
	}
	@Override
	protected void onUnregistered(Context arg0, String arg1) {
		// TODO Auto-generated method stub
		Log.d(TAG, "onUnregistered. regId : "+arg1);
	}
	protected boolean onRecoverableError(Context context, String errorId) {
		Log.d(TAG, "onRecoverableError. errorId : "+errorId);
		return super.onRecoverableError(context, errorId);
	}
	@SuppressWarnings("deprecation")
	private static void generateNotification(Context context,String message) {
        int icon = R.drawable.smartrecipe;
        long when = System.currentTimeMillis();
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = new Notification(icon, message, when);
         
        String title = context.getString(R.string.app_name);
         
        Intent notificationIntent = new Intent(context, MainActivity.class);
        // set intent so it does not start a new activity
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent intent =
                PendingIntent.getActivity(context, 0, notificationIntent, 0);
        notification.setLatestEventInfo(context,title , message, intent);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
         
        // Play default notification sound
        notification.defaults |= Notification.DEFAULT_SOUND;
         
        // Vibrate if vibrate is enabled
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notificationManager.notify(0, notification);      
 
    }
}
