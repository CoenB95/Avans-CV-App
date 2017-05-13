package com.cbapps.uxdweek3_cvapp;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cbapps.uxdweek3_cvapp.projects.Project;
import com.cbapps.uxdweek3_cvapp.projects.ProjectsAdapter;

import java.util.Arrays;

public class MyProjectsActivity extends AppCompatActivity {

	private ProjectsAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_projects);

		adapter = new ProjectsAdapter(new ProjectsAdapter.OnProjectSelectedListener() {
			@Override
			public void onProjectSelected(Project p, View v) {
				Intent intent = new Intent(getBaseContext(), DetailActivity.class);
				intent.putExtra(DetailActivity.EXTRA_PROJECT, p);
				startActivity(intent, createTransitionBundle(v));
			}
		});

		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setAdapter(adapter);

		CollapsingToolbarLayout collapsingToolbar =
				(CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
		collapsingToolbar.setTitle(getResources().getString(R.string.my_projects));

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
		setSupportActionBar(toolbar);

		adapter.setAllProjects(Arrays.asList(Project.ALL_PROJECTS));
	}

	private Bundle createTransitionBundle(View view) {
		return ActivityOptionsCompat.makeSceneTransitionAnimation(
				this, view, "projectImageView").toBundle();
	}
}
