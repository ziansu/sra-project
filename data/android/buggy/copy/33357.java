public boolean isEnabled() {
    try {
        assertPermission(PasswordPermission.CHANGE);
        return !(realmService.isReadOnly(getCurrentRealm()));
    } catch (com.hypersocket.permissions.AccessDeniedException e) {
        return false;
    }
}