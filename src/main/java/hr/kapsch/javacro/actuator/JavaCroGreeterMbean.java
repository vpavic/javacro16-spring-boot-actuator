package hr.kapsch.javacro.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

// TODO 7: enable Jolokia
//@Component
@ManagedResource
public class JavaCroGreeterMbean {

	private static final Logger LOGGER = LoggerFactory.getLogger(JavaCroGreeterMbean.class);

	// hr.kapsch.javacro.actuator:name=javaCroGreeterMbean,type=JavaCroGreeterMbean/greet
	@ManagedOperation
	public void greet() {
		LOGGER.info("Hello JavaCRO '16!");
	}

}
