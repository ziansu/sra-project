public org.mutabilitydetector.checkers.CollectionField.GenericType withoutWildcard() {
    if ("?".equals(wildcard)) {
        return new org.mutabilitydetector.checkers.CollectionField.GenericType(org.mutabilitydetector.locations.Dotted.fromClass(java.lang.Object.class), "=", false);
    }
    return new org.mutabilitydetector.checkers.CollectionField.GenericType(type, "=", false);
}