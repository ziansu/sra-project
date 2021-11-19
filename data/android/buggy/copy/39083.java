@java.lang.Override
public void removePermission(java.lang.String permission) {
    if (!(getPermissionsAsString().contains(permission))) {
        return ;
    }
    super.removePermission(permission);
    updateCalculable();
}