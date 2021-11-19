private static java.lang.String determineNullIdentifier(junitparams.converters.Nullable annotation) {
    java.lang.String nullIdentifier = annotation.value();
    if (!(Nullable.DEFAULT_NULL_IDENTIFIER.equals(nullIdentifier))) {
        return nullIdentifier;
    }
    return annotation.nullIdentifier();
}