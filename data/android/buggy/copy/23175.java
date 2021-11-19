@java.lang.Override
public void deleteConsistencyGroup(java.net.URI storage, java.net.URI consistencyGroup, java.lang.Boolean markInactive, java.lang.String opId) throws com.emc.storageos.volumecontroller.ControllerException {
    deleteReplicationGroupInConsistencyGroup(storage, consistencyGroup, null, false, markInactive, opId);
}