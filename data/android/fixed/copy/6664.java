public void installHybrisArtifactsTest() {
    final java.io.File hybrisInstallationDirectory = com.divae.ageto.hybris.utils.EnvironmentUtils.getHybrisInstallationDirectory();
    final com.divae.ageto.hybris.install.InstallHybrisArtifacts installHybrisArtifacts = new com.divae.ageto.hybris.install.InstallHybrisArtifacts(hybrisInstallationDirectory, getTempDirectory(), true);
    installHybrisArtifacts.execute();
}