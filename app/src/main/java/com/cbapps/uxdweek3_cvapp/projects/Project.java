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
					"Mijn CV [Android] (Avans TI 1.4)",
					"Voor de 4e periode in het eerste leerjaar van de opleiding TI op Avans Breda, " +
							"diende er een applicatie gemaakt te worden om jezelf te promoten; een " +
							"CV app. Zie hier voor U het resultaat daarvan."),
			new Project("Festivalplanner", R.mipmap.photo_festivalplanner, 2017,
					"Een Festival Simulator [Java] (Avans TI 1.3)",
					"Het derde project in opdracht van Avans betrof een desktop simulatie " +
							"programma voor het plannen van festivals. Vooral het simulator " +
							"gedeeldte is naar mijn mening vrij mooi geworden en bijna bug-vrij " +
							"geworden. Het was een leuk project, met een even zo gezellige " +
							"groep."),
			new Project("Boe(m)Bot", R.mipmap.photo_boe_bot, 2017,
					"Automatisch Geleid Voertuig [Java] (Avans TI 1.2)",
					"In periode twee van de opleiding werden de opdrachten al wat interessanter. " +
							"Deze keer moesten we een Board-of-Education-Bot laten rondrijden. " +
							"Het interessante voor mij eraan was dat ik nog nooit eerder met " +
							"Java iets fysieks had aangestuurd, ik dacht eigenlijk dat dat niet " +
							"kon. Dit project heeft daarom mijn ogen meer geopend, al verloopt " +
							"thuis ermee oefenen moeilijk als je die hardware niet hebt."),
			new Project("Internet Weerstation", R.mipmap.photo_iwapp, 2017,
					"Java basics leren [Java] (Avans TI 1.1)",
					"Het allereerste project in de opleiding TI op Avans Breda. Dit project " +
							"was bedoeld ter introductie voor mensen met minder ervaring, en " +
							"is daardoor niet zo spannend. Wel hadden we er al geavanceerde " +
							"elementen in gestopt zoals gebruik van lambda's, dat op zich " +
							"liet wachten tot de derde periode."),
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
