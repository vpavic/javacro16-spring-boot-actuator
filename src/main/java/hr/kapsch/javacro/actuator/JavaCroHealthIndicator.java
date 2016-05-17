package hr.kapsch.javacro.actuator;

import java.time.LocalDateTime;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

// TODO 5: enable custom health indicator
//@Component
public class JavaCroHealthIndicator extends AbstractHealthIndicator {

	private static final LocalDateTime JAVA_CRO_16_START = LocalDateTime.of(2016, 5, 18, 18, 30);
	private static final LocalDateTime JAVA_CRO_16_END = LocalDateTime.of(2016, 5, 20, 18, 30);

	@Override
	protected void doHealthCheck(Health.Builder builder) throws Exception {
		LocalDateTime now = LocalDateTime.now();
		if (now.isBefore(JAVA_CRO_16_START)) {
			builder.down().withDetail("message", "JavaCRO '16 starts on " + JAVA_CRO_16_START);
		}
		else if (now.isAfter(JAVA_CRO_16_END)) {
			builder.down().withDetail("message", "JavaCRO '16 as ended on " + JAVA_CRO_16_END);
		}
		else {
			builder.up().withDetail("message", "JavaCRO '16 is in progress");
		}
	}

}
