public boolean isAutoUpdate() {
    return ((line) != null) && (!(line.hasOption(org.owasp.dependencycheck.CliParser.ARGUMENT.DISABLE_AUTO_UPDATE)));
}