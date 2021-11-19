public java.lang.String[] remove(java.lang.String directory, java.lang.String[] filesToRemove) {
    return runProcess(directory, "gitRemove.sh", filesToRemove);
}