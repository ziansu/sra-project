private void setGenericRoles(org.openforis.collect.model.User user) {
    if (user != null) {
        org.openforis.collect.model.UserRole role = (org.openforis.collect.manager.ADMIN_USER_NAME.equals(user.getUsername())) ? org.openforis.collect.model.UserRole.ADMIN : org.openforis.collect.model.UserRole.ANALYSIS;
        user.setRoles(java.util.Arrays.asList(role));
    }
}