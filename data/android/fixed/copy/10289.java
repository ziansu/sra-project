public static java.lang.Double doubleOrNull(java.lang.String reference) {
    if (reference == null)
        return null;
    
    try {
        return new java.lang.Double(us.hawtrey.preconditions.Assure.trimmedOrEmpty(reference));
    } catch (java.lang.NumberFormatException e) {
        return null;
    }
}