@java.lang.Override
public boolean isBrandNew(org.automagic.deps.doctor.TransitiveDependency dependency) {
    return !(exists(project.getDependencies(), dependency.getArtifact()));
}