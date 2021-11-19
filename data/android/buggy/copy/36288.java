@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked && (checkAndAskForContactsReadPermission(PermissionUtil.PERMISSIONS_READ_CONTACTS_AUTOMATIC))) {
        setAutomaticBackup(true);
    }else {
        setAutomaticBackup(false);
    }
}