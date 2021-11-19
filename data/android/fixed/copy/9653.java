public hudson.tasks.Maven.MavenInstallation[] getMavenInstallations() {
    return hudson.model.Hudson.getInstance().getDescriptorByType(Maven.DescriptorImpl.class).getInstallations();
}