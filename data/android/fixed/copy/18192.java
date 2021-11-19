private static void stopSaverServiceFor(final org.eclipse.ui.IWorkbenchPart part) {
    if (com.laboki.eclipse.plugin.smartsave.main.Factory.servicesMapDoesNotContain(part))
        return ;
    
    com.laboki.eclipse.plugin.smartsave.main.Factory.SERVICES_MAP.remove(part).end();
}