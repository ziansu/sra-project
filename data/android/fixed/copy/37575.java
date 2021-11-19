public static java.lang.String trimmedLowerOrNull(java.lang.String reference) {
    return reference == null ? null : us.hawtrey.preconditions.Assure.trimmedLowerOrEmpty(reference);
}