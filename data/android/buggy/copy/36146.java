private void setRole(appl.data.enums.UserRoles role) {
    if (role == null) {
        throw new java.lang.IllegalArgumentException(exceptions.data.ErrorMessageHelper.nullOrEmptyMessage("UserRole"));
    }
    this.role = role.toString();
}