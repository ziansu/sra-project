private java.lang.String getSDKVersion() {
    final java.lang.String version = getString(R.string.sdk_version_string, com.spotxchange.sdk.android.SpotxAdSettings.getSdkVersion());
    return version;
}