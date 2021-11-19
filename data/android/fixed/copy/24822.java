private boolean isFailedOver(final javax.cim.CIMInstance syncInstance) {
    java.lang.String copyState = syncInstance.getPropertyValue(com.emc.storageos.volumecontroller.impl.smis.CP_COPY_STATE).toString();
    return java.lang.String.valueOf(com.emc.storageos.volumecontroller.impl.smis.FAILOVER_SYNC_PAIR).equalsIgnoreCase(copyState);
}