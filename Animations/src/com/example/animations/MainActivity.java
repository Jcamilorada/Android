package com.example.animations;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		TextView textView = (TextView) findViewById(R.id.textView);
		switch (item.getItemId()) {
		case R.id.alpha:
			textView = (TextView) findViewById(R.id.textView);
			Animation animation = AnimationUtils.loadAnimation(
					getApplicationContext(), R.anim.alpha);
			textView.startAnimation(animation);
			return true;
		case R.id.rotate:
			animation = AnimationUtils.loadAnimation(getApplicationContext(),
					R.anim.rotate);
			textView.startAnimation(animation);
			return true;
		case R.id.transalate:
			animation = AnimationUtils.loadAnimation(getApplicationContext(),
					R.anim.translate);
			textView.startAnimation(animation);
			return true;
		case R.id.scale:
			animation = AnimationUtils.loadAnimation(getApplicationContext(),
					R.anim.scale);
			textView.startAnimation(animation);
			return true;
		case R.id.property:
			ObjectAnimator anim = ObjectAnimator.ofFloat(textView, "textSize",
					25.0f, 50.0f);
			anim.setDuration(1000);
			anim.setInterpolator(new LinearInterpolator());
			anim.start();
			return true;

		default:
			return super.onOptionsItemSelected(item);

		}

	}
}
