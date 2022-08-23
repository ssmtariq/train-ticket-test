package seat.service;
// importing for Annotation 
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
public @interface SperfAnno {
    public String monitorObject() default "";
}
