protected int incrementalPublish(org.eclipse.wst.server.core.IModule module, org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    org.jboss.ide.eclipse.as.management.core.IncrementalDeploymentManagerService service = ((org.jboss.ide.eclipse.as.management.core.IncrementalDeploymentManagerService) (getService()));
    return new org.jboss.tools.as.core.server.controllable.subsystems.internal.ManagementPublishController.IncrementalManagementPublishRunner().incrementalPublish(module, service, monitor);
}