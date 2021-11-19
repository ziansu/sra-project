@java.lang.Override
public boolean shouldShowRequestPermissionRationale(@android.support.annotation.NonNull
java.lang.String permission) {
    if (Manifest.permission.GET_ACCOUNTS.equals(permission)) {
        return new de.iweinzierl.worktrack.util.SettingsHelper(this).askAgainForGetAccountsPermission();
    }
    return false;
}