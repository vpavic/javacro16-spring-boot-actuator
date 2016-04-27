package hr.kapsch.javacro.actuator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import hr.kapsch.javacro.actuator.JavaCroEndpoint.Lecture;

@Component
public class JavaCroEndpoint extends AbstractEndpoint<List<Lecture>> {

	private static final List<Lecture> LECTURES = new ArrayList<>(3);

	static {
		LECTURES.add(new Lecture("Vedran Pavić", "Managing user's session with Spring Session",
				LocalDateTime.of(2016, 5, 19, 12, 0), "Hall D", 30));
		LECTURES.add(new Lecture("Vjeran Marčinko", "Demand-oriented web architecture",
				LocalDateTime.of(2016, 5, 19, 12, 40), "Hall C", 30));
		LECTURES.add(new Lecture("Vedran Pavić", "Meeting non-functional requirements with Spring Boot Actuator",
				LocalDateTime.of(2016, 5, 19, 18, 0), "Hall A", 30));
	}

	public JavaCroEndpoint() {
		super("javacro");
	}

	@Override
	public List<Lecture> invoke() {
		return LECTURES;
	}

	public static class Lecture {

		private String speaker;
		private String title;
		private LocalDateTime dateTime;
		private String room;
		private int duration;

		public Lecture(String speaker, String title, LocalDateTime dateTime, String room, int duration) {
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

		public LocalDateTime getDateTime() {
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
