public void validate(java.lang.String formName) {
    play.data.validation.Validation.valid(formName, this);
    if (!(controllers.resources.ConsistencyGroups.ConsistencyGroupForm.validateCGName(this.name))) {
        play.data.validation.Validation.addError((formName + ".name"), "consistencyGroups.invalid.name.error");
    }
}