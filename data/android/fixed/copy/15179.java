@java.lang.Override
public boolean isValid(io.oasp.gastronomy.restaurant.general.common.api.datatype.Money value, javax.validation.ConstraintValidatorContext context) {
    if (value == null) {
        return true;
    }
    return (value.getValue().compareTo(java.math.BigDecimal.ZERO)) >= 0;
}