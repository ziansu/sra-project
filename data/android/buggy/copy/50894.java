public void doStartup(org.labkey.api.module.ModuleContext moduleContext) {
    org.labkey.api.data.ContainerManager.addContainerListener(new org.labkey.cds.CDSContainerListener());
    ensureShortcuts();
}