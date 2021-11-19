private Workflow.Method removeVolumeFromCGMethod(java.net.URI storageUri, java.net.URI cguri, java.util.List<java.net.URI> removeVols) {
    return new com.emc.storageos.workflow.Workflow.Method(com.emc.storageos.vplexcontroller.VPlexDeviceController.REMOVE_FROM_CONSISTENCY_GROUP_METHOD_NAME, storageUri, cguri, removeVols);
}