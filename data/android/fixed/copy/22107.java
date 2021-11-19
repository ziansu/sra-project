private boolean isClientInvalidRecordExpired(com.emc.storageos.model.auth.InvalidLogins invLogins) {
    if ((null != invLogins) && (((getCurrentTimeInMins()) - (invLogins.getLastAccessTimeInLong())) >= (_maxAuthnLoginAttemtsLifeTimeInMins))) {
        return true;
    }
    return false;
}