public void consumeLine(java.lang.String line) {
    com.pablissimo.sonar.TsLintExecutorImpl.LOG.trace(("TsLint Out: " + line));
    stdOut.append((line + "\n"));
}