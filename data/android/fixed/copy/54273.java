public boolean addRole(fr.epsi.users.model.UserRoles.Role role) {
    return userRoles.add(new fr.epsi.users.model.UserRoles(id, role));
}