public void checkDevice(long userId, long deviceId) throws java.lang.SecurityException {
    if (!(getNotNull(userId).contains(deviceId))) {
        throw new java.lang.SecurityException("Device access denied");
    }
}