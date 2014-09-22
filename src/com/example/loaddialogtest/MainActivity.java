package com.example.loaddialogtest;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	Dialog load;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
	    load=  LoadDialog.createLoadingDialog(MainActivity.this, "图片下载中");
		load.show();
		
	}



}
