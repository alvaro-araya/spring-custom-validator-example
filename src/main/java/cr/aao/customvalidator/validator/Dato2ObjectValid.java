package cr.aao.customvalidator.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = Dato2ObjectValidator.class)
@Documented
public @interface Dato2ObjectValid {

    String message() default "{Dato2Object.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
