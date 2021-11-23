@java.lang.Override
public boolean isValid(java.lang.CharSequence value, javax.validation.ConstraintValidatorContext context) {
    return (null != value) && ((value.toString().trim().length()) > 0);
}