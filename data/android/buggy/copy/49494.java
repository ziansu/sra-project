public void setNewPermissions() {
    java.util.List<main.domain.enums.Permission> permissions = selectedPermissions;
    currentUser.setPermissions(permissions);
    userService.update(currentUser);
}