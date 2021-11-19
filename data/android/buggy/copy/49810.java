@java.lang.Override
public boolean isValid(org.springframework.web.multipart.MultipartFile value, javax.validation.ConstraintValidatorContext context) {
    return !(value.isEmpty());
}