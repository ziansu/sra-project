private static void abort(de.cologneintelligence.fitgoodies.runners.ArgumentParser parser, java.lang.Throwable t) throws java.lang.Throwable {
    if (!(parser.isNoExit())) {
        try {
            java.lang.System.exit(1);
        } catch (java.lang.SecurityException ignored) {
        }
    }
    throw t;
}