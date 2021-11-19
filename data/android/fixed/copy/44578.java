@java.lang.Override
public javax.validation.metadata.BeanDescriptor getConstraintsForClass(java.lang.Class<?> clazz) {
    org.springframework.util.Assert.state(((this.targetValidator) != null), "No target Validator set");
    return this.targetValidator.getConstraintsForClass(clazz);
}