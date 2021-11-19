@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (checkAndAskForContactsReadPermission(PermissionUtil.PERMISSIONS_READ_CONTACTS_AUTOMATIC)) {
        if (isChecked) {
            setAutomaticBackup(true);
        }else {
            setAutomaticBackup(false);
        }
    }
}