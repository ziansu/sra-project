private java.lang.String getSDKVersion() {
    final android.content.Context ctx = getActivity();
    final java.lang.String version = ctx.getString(R.string.sdk_version_string, com.spotxchange.sdk.android.SpotxAdSettings.getSdkVersion());
    return version;
}