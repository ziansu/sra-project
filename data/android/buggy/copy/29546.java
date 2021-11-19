@java.lang.Override
public boolean isBrandNew(org.automagic.deps.doctor.TransitiveDependency dependency) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<org.apache.maven.model.Dependency> dependencies = project.getDependencies();
    return !(exists(dependencies, dependency.getArtifact()));
}