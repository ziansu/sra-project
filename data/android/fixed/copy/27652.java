@java.lang.Override
public <RET extends com.orientechnologies.orient.core.record.ORecord> RET save(final com.orientechnologies.orient.core.record.ORecord iRecord) {
    return ((RET) (save(iRecord, null, OPERATION_MODE.SYNCHRONOUS, false, null, null)));
}