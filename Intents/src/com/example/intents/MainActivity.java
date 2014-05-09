package com.example.intents;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private static String AÑO_NUEVO = "AÑO_NUEVO"; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new MainFragment()).commit();
		}
		
		IntentFilter itentFilter = new IntentFilter();
		itentFilter.addAction(AÑO_NUEVO);
		registerReceiver(new MyReceiver(), itentFilter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_2) {
			Intent goToSecondActivity = new Intent(this, SecondActivity.class);
			startActivity(goToSecondActivity);
		}
		if (id == R.id.action_2_parameters) {
			Intent goToSecondActivity = new Intent(this, SecondActivity.class);
			goToSecondActivity.putExtra("Para", "Destinatario@correo.com");
			goToSecondActivity.putExtra("Contenido", "Contenido del correo");
			startActivity(goToSecondActivity);
		}
		if (id == R.id.action_browser) {
			String url = "http://camilorada.wordpress.com";
			Intent browserItent = new Intent(Intent.ACTION_VIEW);
			browserItent.setData(Uri.parse(url));
			startActivity(browserItent);
		}
		if (id == R.id.start_action_service) {
			Intent service = new Intent(this, MyService.class);
			startService(service);
		}
		if (id == R.id.stop_action_service) {
			Intent service = new Intent(this, MyService.class);
			stopService(service);
		}
		if (id == R.id.action_new_year) {
			Intent broadCastItent = new Intent();
			broadCastItent.setAction(AÑO_NUEVO);
			sendBroadcast(broadCastItent);
		}
		return super.onOptionsItemSelected(item);
	}
}
