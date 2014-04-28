package com.example.listview;

import android.app.Activity;
import android.os.Bundle;

public class ContactosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new ContactosFragment()).commit();
		}
	}
}
