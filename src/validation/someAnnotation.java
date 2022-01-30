package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = myValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface someAnnotation {
    String value() default "HEY";
    String message() default "Must start with HEY";

    //Define default groups
    Class<?>[] groups() default {};
    //Define default payload
    Class<? extends Payload>[] payload() default{};
}
