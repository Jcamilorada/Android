package com.example.intents;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Toast.makeText(this, "Servicio corriendo", Toast.LENGTH_LONG).show();
		return START_STICKY;
	}
	
	

	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "Servicio destruido", Toast.LENGTH_LONG).show();
	}



	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}
