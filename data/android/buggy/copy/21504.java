private java.lang.String normalizeCommandLine(java.lang.String commandLine) {
    return commandLine.trim().replaceAll(((org.rabix.bindings.CommandLine.PART_SEPARATOR) + "+"), org.rabix.bindings.CommandLine.PART_SEPARATOR);
}