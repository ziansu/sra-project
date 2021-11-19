public void testDeleteApplicationPermissionOfApiUser(eu.supersede.integration.api.feedback.types.ApiUserPermission permission) throws java.lang.Exception {
    proxy.deleteApplicationPermissionsOfApiUser(permission.getId(), userId);
}