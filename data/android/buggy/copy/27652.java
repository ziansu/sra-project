@java.lang.Override
public <RET extends com.orientechnologies.orient.core.record.ORecord> RET save(final com.orientechnologies.orient.core.record.ORecord iRecord, final java.lang.String iClusterName) {
    return ((RET) (save(iRecord, iClusterName, OPERATION_MODE.SYNCHRONOUS, false, null, null)));
}