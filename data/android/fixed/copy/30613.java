@java.lang.Override
public void createSnapshot(java.net.URI storage, java.util.List<java.net.URI> snapshotList, java.lang.Boolean createInactive, java.lang.Boolean readOnly, java.lang.String opId) throws com.emc.storageos.svcs.errorhandling.resources.InternalException {
    blockRMI("createSnapshot", storage, snapshotList, createInactive, readOnly, opId);
}