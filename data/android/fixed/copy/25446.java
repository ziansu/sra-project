private org.sonar.java.resolve.Resolve.Resolution unresolved() {
    org.sonar.java.resolve.Resolve.Resolution resolution = new org.sonar.java.resolve.Resolve.Resolution(symbolNotFound);
    resolution.type = symbols.unknownType;
    return resolution;
}