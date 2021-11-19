public static java.lang.String getPackageVersionName(final android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
    android.content.pm.PackageInfo info = com.jana.android.core.utils.DeviceInfo.getPackageInfo(context);
    java.lang.String version = info.versionName;
    return version;
}