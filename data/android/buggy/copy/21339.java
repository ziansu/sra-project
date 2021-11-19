public boolean findTestedAndInjectableFields(@mockit.internal.expectations.injection.Nonnull
java.lang.Class<?> testClass) {
    boolean foundTestedFields = findAllTestedAndInjectableFieldsInTestClassHierarchy(testClass);
    if (foundTestedFields) {
        new mockit.internal.expectations.injection.ParameterNameExtractor(true).extractNames(testClass);
    }
    return foundTestedFields;
}