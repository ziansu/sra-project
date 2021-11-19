public static org.netbeans.gradle.project.properties.NbGradleSingleProjectConfigProvider create(org.netbeans.gradle.project.NbGradleProject project) {
    java.nio.file.Path rootDir = org.netbeans.gradle.project.properties.SettingsFiles.getRootDirectory(project);
    return new org.netbeans.gradle.project.properties.NbGradleSingleProjectConfigProvider(project, org.netbeans.gradle.project.properties.NbGradleConfigProvider.getConfigProvider(rootDir));
}