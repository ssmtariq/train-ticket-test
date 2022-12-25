package adminbasic.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface SperfAnno {
    public String monitorObject() default "";
}
