public org.apache.maven.surefire.booter.Classpath getProviderClasspath() throws org.apache.maven.artifact.resolver.ArtifactNotFoundException, org.apache.maven.artifact.resolver.ArtifactResolutionException {
    return dependencyResolver.getProviderClasspath("surefire-junit-platform", surefireBooterArtifact.getBaseVersion(), null);
}