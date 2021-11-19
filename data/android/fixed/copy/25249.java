public java.util.Collection<java.io.File> getClasspath() {
    return org.jetbrains.jps.ProjectPaths.getCompilationClasspath(this.chunk, true);
}