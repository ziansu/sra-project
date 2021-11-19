private void fixBonitaHomeIfNotSet() {
    java.lang.System.setProperty("bonita.home", java.lang.System.getProperty("bonita.home", org.bonitasoft.engine.io.IOUtil.createTempDirectoryInDefaultTempDirectory("bonita_home").getAbsolutePath()));
}