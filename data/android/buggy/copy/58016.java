public java.lang.String[] status(java.lang.String directory) {
    return runProcess(directory, "gitStatus.sh", new java.lang.String[0]);
}