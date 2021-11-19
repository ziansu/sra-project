public void reinit(java.util.Collection<java.lang.String> sourceGroups, java.lang.String projectRootDir) {
    clear();
    this.sourceGroups.clear();
    this.sourceGroups.addAll(sourceGroups);
    this.projectRootDir = projectRootDir;
}