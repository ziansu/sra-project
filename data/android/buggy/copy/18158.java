private java.lang.String getGCMRegistrationToken() {
    java.lang.String registrationToken = getStoredRegistrationToken();
    if (registrationToken == null) {
        registrationToken = im.vector.gcm.GCMHelper.getRegistrationToken(mContext);
    }
    return registrationToken;
}