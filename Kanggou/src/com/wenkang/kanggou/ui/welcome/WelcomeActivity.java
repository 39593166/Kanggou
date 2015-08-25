package com.wenkang.kanggou.ui.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.wenkang.kanggou.R;
import com.wenkang.kanggou.ui.BaseActivity;
import com.wenkang.kanggou.ui.shopping.MainActivity;


public class WelcomeActivity extends BaseActivity implements WelcomeView{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setChildContentView(R.layout.activity_welcome);
	}

	public void click(View v) {
		Intent intent = new Intent();
		intent.setClass(this, MainActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		} else if (id == android.R.id.home) {
			Toast.makeText(this, "���һ�����ܷ�����", 0).show();
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void switchViewPager() {

	}
}
