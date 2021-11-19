public void addPattern(java.lang.String pattern) {
    patterns.add(pattern);
    updatePattern();
    writeConfig();
}