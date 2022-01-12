public boolean hasUserPermission(java.lang.String permission) {
    if ((this.permissionUtils) != null) {
        return this.permissionUtils.hasUserAuthority(permission);
    }
    return false;
}