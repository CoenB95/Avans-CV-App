package com.cbapps.uxdweek3_cvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

	private Button myProjectsButton;
	private ImageView myImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myProjectsButton = (Button) findViewById(R.id.myProjectsButton);
		myImageView = (ImageView) findViewById(R.id.myImageView);



		myProjectsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				createIntent();
			}
		});

		Toolbar toolbar = (Toolbar) findViewById(R.id.actionBar);
		setSupportActionBar(toolbar);
	}

	private void createIntent() {
		startActivity(new Intent(getBaseContext(), MyProjectsActivity.class));
				//, ActivityOptionsCompat
				//.makeSceneTransitionAnimation(this, myImageView, "myImageView").toBundle());
	}
}
