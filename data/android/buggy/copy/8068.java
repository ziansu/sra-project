private void buildWhenThenReturn(com.buschmais.jqassistant.plugin.m2repo.impl.scanner.ArtifactResolver artifactResolver, org.apache.maven.index.ArtifactInfo info) throws org.eclipse.aether.resolution.ArtifactResolutionException {
    org.mockito.Mockito.when(artifactResolver.downloadArtifact(info.groupId, info.artifactId, info.packaging, info.version)).thenReturn(newFile(info));
}