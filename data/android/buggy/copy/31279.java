@java.lang.Override
public boolean isValid(hu.codingmentor.dto.UserDTO user, javax.validation.ConstraintValidatorContext context) {
    return user.getDateOfBirth().isBefore(user.getRegistrationDate());
}