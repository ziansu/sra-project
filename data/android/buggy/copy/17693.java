public static void main(final java.lang.String... args) {
    try {
        java.lang.String[] arguments = new java.lang.String[]{ "--help" };
        de.herrlock.manga.Main.main(arguments);
    } catch (org.apache.commons.cli.ParseException ex) {
        throw new de.herrlock.manga.exceptions.MDRuntimeException(ex);
    }
}