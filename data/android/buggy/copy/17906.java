private void addLanguageDeps() throws org.apache.maven.plugin.MojoExecutionException {
    addDep("org.ceylon-lang", "ceylon.language", Versions.CEYLON_VERSION_NUMBER);
}