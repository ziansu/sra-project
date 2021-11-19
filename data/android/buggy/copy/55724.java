private static java.lang.String getSignature() {
    return APIAccess.getMD5Hash(((((APIAccess.DEV_ID) + "createsession") + (APIAccess.AUTH_KEY)) + (APIAccess.getUtcTimeStamp())));
}