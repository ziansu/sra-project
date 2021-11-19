public com.espirit.moddev.moduleinstaller.ModuleInstallationParameters create() {
    return new com.espirit.moddev.moduleinstaller.ModuleInstallationParameters(projectName, fsm, configurationFileForServiceName, projectAppConfigurationFile, splittedWebAppScopes, webAppConfigurationFilesForWebScopes);
}