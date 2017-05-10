package com.cbapps.uxdweek3_cvapp.projects;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cbapps.uxdweek3_cvapp.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Coen Boelhouwers
 */

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectHolder> {

	private OnProjectSelectedListener listener;
	private List<Project> projects;

	public ProjectsAdapter(OnProjectSelectedListener listener) {
		projects = new ArrayList<>();
		this.listener = listener;
	}

	@Override
	public ProjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new ProjectHolder(LayoutInflater.from(parent.getContext())
				.inflate(R.layout.list_item_project, parent, false));
	}

	@Override
	public int getItemCount() {
		return projects.size();
	}

	@Override
	public void onBindViewHolder(ProjectHolder holder, int position) {
		holder.setProject(projects.get(position));
	}

	public void setAllProjects(Collection<Project> values) {
		projects.clear();
		projects.addAll(values);
	}

	public class ProjectHolder extends RecyclerView.ViewHolder {

		private Project project;
		private ViewGroup layout;
		private TextView titleTextView;

		public ProjectHolder(View itemView) {
			super(itemView);
			layout = (ViewGroup) itemView.findViewById(R.id.layout);
			titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);

			layout.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					listener.onProjectSelected(project);
				}
			});
		}

		public void setProject(Project p) {
			this.project = p;
			titleTextView.setText(project.getTitle());
		}
	}

	public interface OnProjectSelectedListener {
		void onProjectSelected(Project p);
	}
}
