package com.cbapps.uxdweek3_cvapp.projects;

import android.support.annotation.DrawableRes;

import com.cbapps.uxdweek3_cvapp.R;

import java.io.Serializable;

/**
 * @author Coen Boelhouwers
 */

public class Project implements Serializable {

	public static final Project[] ALL_PROJECTS = {
			new Project("CV App", R.mipmap.ic_launcher, 2017,
					"Mijn persoonlijke informatie gepresenteerd [Android] (Avans TI 1.4)",
					"Voor de 4e periode in het eerste leerjaar van de opleiding TI op Avans Breda, " +
							"diende er een applicatie gemaakt te worden om jezelf te promoten; een " +
							"CV app. Zie hier voor U het resultaat daarvan."),
			new Project("Festivalplanner", R.mipmap.photo_festivalplanner, 2017,
					"Een Festival Simulator [Java] (Avans TI 1.3)",
					"Voor de 4e periode in het eerste leerjaar van de opleiding TI op Avans Breda, " +
							"diende er een applicatie gemaakt te worden om jezelf te promoten; een " +
							"CV app. Zie hier voor U het resultaat daarvan."),
			new Project("Roadplacer", R.mipmap.photo_roadplacer, 2017,
					"Een Mini Metro remake hobbyproject [JavaFX]",
					"Dit hobby-project is geïnspireerd door het spel 'Mini Metro' en was mijn " +
							"experiment voor het gebruik van o.a. wegen plaatsen en treinen " +
							"daarover laten rijden.")
	};

	private @DrawableRes int imageRes;
	private String title;
	private int year;
	private String summary;
	private String fullText;

	public Project(String title, @DrawableRes int imageRes, int year,
	               String summary, String fullText) {
		this.title = title;
		this.summary = summary;
		this.year = year;
		this.imageRes = imageRes;
		this.fullText = fullText;
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

	public int getYear() {
		return year;
	}

	public String getFullText() {
		return fullText;
	}
}
