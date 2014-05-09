package com.example.intents;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new SecondFragment()).commit();
		}
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    String Para = extras.getString("Para");
		    String Contenido = extras.getString("Contenido");
		    
		    Toast.makeText(getApplicationContext(), 
		    		Para, Toast.LENGTH_SHORT).show();
		    Toast.makeText(getApplicationContext(), 
		    		Contenido, Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_1) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
