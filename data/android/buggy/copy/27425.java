@java.lang.Override
@nl.runnable.alfresco.behaviours.annotations.ClassPolicy
public void afterCreateVersion(org.alfresco.service.cmr.repository.NodeRef versionableNode, org.alfresco.service.cmr.version.Version version) {
    checkForVirus(versionableNode);
}