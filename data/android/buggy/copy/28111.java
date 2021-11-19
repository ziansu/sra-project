public java.lang.String getString(java.lang.String arg, java.lang.String defaultValue) {
    try {
        return args.get(arg).trim();
    } catch (java.lang.NullPointerException e) {
        return defaultValue;
    }
}