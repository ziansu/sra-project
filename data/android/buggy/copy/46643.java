public hudson.FilePath getWorkspaceFilePath(java.lang.String fileName) {
    return build.getWorkspace().child(fileName);
}