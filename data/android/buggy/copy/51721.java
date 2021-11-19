public java.lang.String print(java.lang.String object, java.util.Locale locale) {
    try {
        return delegate.valueToString(object);
    } catch (java.text.ParseException e) {
        throw new java.lang.IllegalArgumentException(("Unable to print using mask " + (delegate.getMask())), e);
    }
}