package hr.kapsch.javacro.actuator;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import hr.kapsch.javacro.actuator.JavaCroEndpoint.Lecture;

// TODO 4: enable custom endpoint
//@Component
public class JavaCroEndpoint extends AbstractEndpoint<List<Lecture>> {

	private static final List<Lecture> LECTURES = new ArrayList<>(3);

	static {
		LECTURES.add(new Lecture("Vedran Pavić", "Managing user's session with Spring Session",
				new GregorianCalendar(2016, 5, 19, 12, 0).getTime(), "Hall D", 30));
		LECTURES.add(new Lecture("Vjeran Marčinko", "Demand-oriented web architecture",
				new GregorianCalendar(2016, 5, 19, 12, 40).getTime(), "Hall C", 30));
		LECTURES.add(new Lecture("Vedran Pavić", "Meeting non-functional requirements with Spring Boot Actuator",
				new GregorianCalendar(2016, 5, 19, 18, 0).getTime(), "Hall A", 30));
	}

	public JavaCroEndpoint() {
		super("javacro");
	}

	@Override
	public List<Lecture> invoke() {
		return LECTURES;
	}

	static class Lecture {

		private String speaker;
		private String title;
		private Date dateTime;
		private String room;
		private int duration;

		Lecture(String speaker, String title, Date dateTime, String room, int duration) {
			this.speaker = speaker;
			this.title = title;
			this.dateTime = dateTime;
			this.room = room;
			this.duration = duration;
		}

		public String getSpeaker() {
			return speaker;
		}

		public String getTitle() {
			return title;
		}

		public Date getDateTime() {
			return dateTime;
		}

		public String getRoom() {
			return room;
		}

		public int getDuration() {
			return duration;
		}

	}

}
