private org.eclipse.debug.core.ILaunchConfigurationType getConfigurationType() {
    org.eclipse.debug.core.ILaunchManager manager = org.eclipse.debug.core.DebugPlugin.getDefault().getLaunchManager();
    return manager.getLaunchConfigurationType(SDBGDebugCorePlugin.CHROME_LAUNCH_CONFIG_ID);
}