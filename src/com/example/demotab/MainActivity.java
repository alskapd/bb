package com.example.demotab;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TabHost tabhost = getTabHost();

		TabHost.TabSpec spec;
		Intent intent;
		Resources res = getResources();

		intent = new Intent().setClass(this, DemoTab.class);
		spec = tabhost.newTabSpec("artists");
		spec.setIndicator("Artists", res.getDrawable(R.drawable.ic_tabs));
		spec.setContent(intent);
		tabhost.addTab(spec);

		intent = new Intent().setClass(this, DemoTab2.class);
		spec = tabhost.newTabSpec("albums");
		spec.setIndicator("Albums", res.getDrawable(R.drawable.ic_tabs));
		spec.setContent(intent);
		tabhost.addTab(spec);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
