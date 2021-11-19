public static java.lang.Double doubleOrNull(java.lang.String reference) {
    try {
        return new java.lang.Double(us.hawtrey.preconditions.Assure.trimmedOrEmpty(reference));
    } catch (java.lang.NumberFormatException e) {
        return null;
    }
}