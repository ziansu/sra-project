@java.lang.Override
public void removeRole(java.lang.Integer roleId) throws java.lang.Exception {
    org.ednovo.gooru.core.api.model.UserRole userRole = userRepository.findUserRoleByRoleId(roleId);
    rejectIfNull(userRole, org.ednovo.gooru.domain.service.userManagement.GL0056, 404, org.ednovo.gooru.domain.service.userManagement.ROLE);
    userRepository.remove(userRole);
}