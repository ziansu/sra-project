private void removePattern(java.lang.String pattern) {
    patterns.remove(pattern);
    updatePattern();
    writeConfig();
}