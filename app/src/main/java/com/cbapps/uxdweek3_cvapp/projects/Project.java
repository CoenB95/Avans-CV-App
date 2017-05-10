package com.cbapps.uxdweek3_cvapp.projects;

import android.support.annotation.DrawableRes;

import com.cbapps.uxdweek3_cvapp.R;

import java.io.Serializable;

/**
 * @author Coen Boelhouwers
 */

public class Project implements Serializable {

	public static final Project PROJECT_1 = new Project("UXD CV-App",
			R.mipmap.ic_launcher,
			"Voor de 4e periode in het eerste leerjaar van de opleiding TI op Avans Breda, " +
					"diende er een applicatie gemaakt te worden om jezelf te promoten; een " +
					"CV app. Zie hier voor U het resultaat daarvan.");

	public static final Project PROJECT_2 = new Project("Roadplacer",
			R.mipmap.photo_roadplacer_project,
			"Dit hobby-project is geïnspireerd door het spel 'Mini Metro' en was mijn " +
					"experiment voor het gebruik van o.a. wegen plaatsen en treinen " +
					"daarover laten rijden.");

	private @DrawableRes int imageRes;
	private String title;
	private String summary;

	public Project(String title, @DrawableRes int imageRes, String summary) {
		this.title = title;
		this.summary = summary;
		this.imageRes = imageRes;
	}

	public String getTitle() {
		return title;
	}

	public String getSummary() {
		return summary;
	}

	public @DrawableRes int getImageRes() {
		return imageRes;
	}
}
