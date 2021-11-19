public int getVersionCode() {
    int versionCode = 0;
    android.content.pm.PackageInfo info = getPackageInfo();
    if (info != null) {
        versionCode = info.versionCode;
    }
    return versionCode;
}