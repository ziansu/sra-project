@java.lang.Override
public com.devicehive.model.OAuthGrant getById(java.lang.Long grantId) {
    com.devicehive.model.OAuthGrant grant = find(grantId);
    if (grant != null) {
        grant = restoreRefs(grant, null, null);
    }
    return grant;
}