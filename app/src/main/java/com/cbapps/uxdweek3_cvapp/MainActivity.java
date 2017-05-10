package com.cbapps.uxdweek3_cvapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	private Button myProjectsButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myProjectsButton = (Button) findViewById(R.id.myProjectsButton);
		myProjectsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(), MyProjectsActivity.class);
				startActivity(intent);
			}
		});

		Toolbar toolbar = (Toolbar) findViewById(R.id.actionBar);
		setSupportActionBar(toolbar);
	}
}
