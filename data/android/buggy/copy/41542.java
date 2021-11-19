@java.lang.Override
public org.ednovo.gooru.core.api.model.UserRole getRoleByRoleId(java.lang.Integer roleId) {
    org.ednovo.gooru.core.api.model.UserRole userRole = userRepository.findUserRoleByRoleId(roleId);
    rejectIfNull(userRole, org.ednovo.gooru.domain.service.userManagement.GL0056, 404, org.ednovo.gooru.domain.service.userManagement.ROLE);
    return userRole;
}