package org.cdi.advocacy;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;



@Retention(RUNTIME) @Target({TYPE, METHOD, FIELD, PARAMETER})
public @interface TransportConfig {
	int retries() default 5;
}
