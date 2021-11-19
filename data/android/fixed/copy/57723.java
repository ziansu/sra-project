private boolean testValidatorWithoutFeatureNames(java.lang.String constraint) {
    return new org.prop4j.NodeReader().isWellFormed(constraint);
}