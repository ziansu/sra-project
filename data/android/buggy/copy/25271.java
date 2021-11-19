private com.emc.storageos.workflow.Workflow.Method detachMirrorPairMethod(java.net.URI systemURI, java.net.URI sourceURI, java.net.URI targetURI) {
    return new com.emc.storageos.workflow.Workflow.Method(com.emc.storageos.filereplicationcontroller.FileReplicationDeviceController.DETACH_FILE_MIRROR_PAIR_METH, systemURI, sourceURI, targetURI, false);
}