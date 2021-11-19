@java.lang.Override
public java.lang.Void call() throws javax.portlet.ReadOnlyException {
    java.lang.String encodedKey = _encodeKey(namespace, key);
    if (value != null) {
        com.liferay.portlet.PortalPreferencesImpl.super.setValue(encodedKey, value);
    }else {
        reset(encodedKey);
    }
    return null;
}