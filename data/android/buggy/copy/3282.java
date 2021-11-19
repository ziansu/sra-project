public void setRole(com.weframe.model.user.Role role) {
    org.apache.commons.lang3.Validate.notNull(role, "The role cannot be blank");
    this.role = role;
}