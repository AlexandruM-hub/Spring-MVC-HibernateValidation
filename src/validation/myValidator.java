package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class myValidator
        implements ConstraintValidator<someAnnotation, String>{

    private String prefix;

    @Override
    public void initialize(someAnnotation constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s != null){
            return s.startsWith(prefix);
        } else {
            return true;
        }
    }

}
