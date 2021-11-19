@java.lang.Override
public void doCancelMirrorLink(com.emc.storageos.db.client.model.StorageSystem system, com.emc.storageos.db.client.model.FileShare target, com.emc.storageos.volumecontroller.TaskCompleter completer, java.lang.String devSpecificPolicyName) {
    mirrorOperations.cancelMirrorFileShareLink(system, target, completer, devSpecificPolicyName);
}