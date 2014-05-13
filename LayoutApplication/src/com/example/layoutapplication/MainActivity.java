package com.example.layoutapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fragments.FrameFragment;
import com.example.fragments.GridFragment;
import com.example.fragments.HorizontalFragment;
import com.example.fragments.RelativeFragment;
import com.example.fragments.VerticalFragment;

public class MainActivity extends Activity {

	public static String CONTENT = "CONTENT_TAG";
	public static HorizontalFragment hFragment = new HorizontalFragment();
	public static VerticalFragment vFragment = new VerticalFragment();
	public static RelativeFragment rFragment = new RelativeFragment();
	public static GridFragment gFragment = new GridFragment();
	public static FrameFragment frameFragment = new FrameFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, hFragment, CONTENT).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction ft = fragmentManager.beginTransaction();

		if (id == R.id.lineal_h) {
			ft.replace(R.id.container, hFragment, CONTENT);
		}

		else if (id == R.id.lineal_v) {
			ft.replace(R.id.container, vFragment, CONTENT);
		}

		else if (id == R.id.relativo) {
			ft.replace(R.id.container, rFragment, CONTENT);
		}
		
		else if (id == R.id.grid){
			ft.replace(R.id.container, gFragment, CONTENT);
		}
		
		else if (id == R.id.frameLayout){
			ft.replace(R.id.container, frameFragment, CONTENT);
		}

		ft.commit();
		return super.onOptionsItemSelected(item);
	}
}
