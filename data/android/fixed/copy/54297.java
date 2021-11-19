public static java.lang.Boolean parseBoolean(final android.content.Intent intent, final java.lang.String key) {
    android.os.Bundle b = intent.getExtras();
    if (b == null) {
        return null;
    }
    return org.deviceconnect.android.profile.DConnectProfile.parseBoolean(b.get(key));
}