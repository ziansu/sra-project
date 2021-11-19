public int getApplicationVersionCode() {
    try {
        return this.getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
    } catch (android.content.pm.PackageManager e) {
        throw new java.lang.RuntimeException(e.getMessage());
    }
}