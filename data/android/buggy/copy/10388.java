@java.lang.Override
public void beforeDisconnect(hudson.slaves.SlaveComputer computer, hudson.model.TaskListener listener) {
    try {
        ensureLauncherIsSet(computer);
    } catch (java.io.IOException e) {
        jenkins.plugins.openstack.compute.JCloudsLauncher.LOGGER.log(java.util.logging.Level.WARNING, "Unable to create launcher", e);
    }
    super.beforeDisconnect(computer, listener);
}