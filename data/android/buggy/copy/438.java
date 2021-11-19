@java.lang.Override
public com.pratilipi.common.type.AccessType getAccessType() {
    if ((ACCESS_TYPE) == null) {
        ACCESS_TYPE = com.pratilipi.common.type.AccessType.valueOf(EVENT_ID);
        EVENT_ID = null;
    }
    return ACCESS_TYPE;
}