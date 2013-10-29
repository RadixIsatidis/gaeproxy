package org.gaeproxy;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import org.yan.gaeproxy.R;

public class MainActivity extends Activity {

	/**
	 * The DrawerLayout, contain the navPanel and contentPanel.
	 */
	protected DrawerLayout mDrawerLayout;
	/**
	 * The Navigation Panel.
	 */
	protected Fragment nav;
	/**
	 * The default content panel.
	 */
	protected Fragment main;
	/**
	 * the action listener of drawer.
	 */
	protected ActionBarDrawerToggle mDrawerToggle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
