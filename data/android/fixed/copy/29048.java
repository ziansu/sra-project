public boolean deleteApi(java.lang.String id) throws java.io.IOException, uk.ac.open.kmi.basil.core.auth.exceptions.UserApiMappingException {
    if (data.deleteSpec(id)) {
        userManager.deleteUserApiMap(id);
        return true;
    }
    return false;
}