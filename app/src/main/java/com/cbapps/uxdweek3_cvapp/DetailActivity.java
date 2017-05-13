package com.cbapps.uxdweek3_cvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.cbapps.uxdweek3_cvapp.projects.Project;
import com.squareup.picasso.Picasso;

/**
 * @author Coen Boelhouwers
 */

public class DetailActivity extends AppCompatActivity {

	public static final String EXTRA_PROJECT = "project";

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);

		Intent intent = getIntent();
		Project project = (Project) intent.getSerializableExtra(EXTRA_PROJECT);

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
		TextView projectTitleTextView = (TextView) findViewById(R.id.projectTitleTextView);
		TextView projectSummaryTextView = (TextView) findViewById(R.id.projectSummaryTextView);
		TextView projectFullTextView = (TextView) findViewById(R.id.projectFullTextView);
		TextView projectYearTextView = (TextView) findViewById(R.id.projectYearTextView);
		ImageView projectImageView = (ImageView) findViewById(R.id.projectImageView);
		ImageView myImageView = (ImageView) findViewById(R.id.imageView2);

		setSupportActionBar(toolbar);

		Picasso.with(getBaseContext())
				.load(R.mipmap.photo_efteling_small)
				.resize(100, 100)
				.centerCrop()
				.into(myImageView);

		if (project != null) {
			projectTitleTextView.setText(project.getTitle());
			projectSummaryTextView.setText(project.getSummary());
			projectFullTextView.setText(project.getFullText());
			projectYearTextView.setText(String.valueOf(project.getYear()));
			Picasso.with(getBaseContext())
					.load(project.getImageRes())
					.into(projectImageView);
		}
	}
}
