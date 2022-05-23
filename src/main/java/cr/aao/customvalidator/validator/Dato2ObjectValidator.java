package cr.aao.customvalidator.validator;

import cr.aao.customvalidator.controller.Dato2Object;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Dato2ObjectValidator implements ConstraintValidator<Dato2ObjectValid, Dato2Object> {

    @Override
    public boolean isValid(Dato2Object value, ConstraintValidatorContext context) {
        System.out.println("VALIDATION: " + value);
        return false;
    }
}
