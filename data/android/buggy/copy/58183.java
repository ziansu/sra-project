@java.lang.Override
public void validation() {
    validator(java.lang.String.class).validate(remoteId).withValidator(new dtos.validation.validators.NotNullOrEmptyValidator());
    validator(java.lang.String.class).validate(cloudProviderId).withValidator(new dtos.validation.validators.NotNullOrEmptyValidator());
}