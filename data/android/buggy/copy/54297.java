public static java.lang.Boolean parseBoolean(final android.content.Intent intent, final java.lang.String key) {
    android.os.Bundle b = intent.getExtras();
    if (b == null) {
        return java.lang.Boolean.FALSE;
    }
    return org.deviceconnect.android.profile.DConnectProfile.parseBoolean(b.get(key));
}