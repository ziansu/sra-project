@java.lang.Override
public boolean isActiveEvenInBackground(java.lang.String pkgName) {
    boolean result = mBgActiveApps.contains(pkgName);
    return result;
}