protected org.springframework.shell.core.CommandResult removeApplication(java.lang.String app) {
    return getShell().executeCommand(java.lang.String.format("rm-app --name %s --scriptUsage ", app));
}