private static java.lang.String getProgramVersion() {
    try {
        return com.databasepreservation.Main.class.getPackage().getImplementationVersion();
    } catch (java.lang.Exception e) {
        com.databasepreservation.Main.logger.debug("Problem getting program version", e);
        return null;
    }
}