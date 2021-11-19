@java.lang.Override
public Workflow.Method deleteOrRemoveVolumesFromExportMaskMethod(java.net.URI arrayURI, java.net.URI exportGroupURI, java.net.URI exportMaskURI, java.util.List<java.net.URI> volumes, java.util.List<java.net.URI> initiatorURIs) {
    return new com.emc.storageos.workflow.Workflow.Method("deleteOrRemoveVolumesFromExportMask", arrayURI, exportGroupURI, exportMaskURI, volumes);
}