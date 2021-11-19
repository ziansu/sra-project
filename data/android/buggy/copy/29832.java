@java.lang.Override
public fi.muikku.model.users.UserEntity getLoggedUserEntity() {
    if (!(isLoggedIn())) {
        return null;
    }
    return userEntityController.findUserEntityByDataSourceAndIdentifier(getLoggedUserSchoolDataSource(), getLoggedUserIdentifier());
}