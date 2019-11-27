package sda.krk24.zajecia2.time;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( value = ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultValues {

    String name() default "Jerzy";
    String surname() default "Nowak";
    int age() default 5;

}
