public static com.pratilipi.data.client.UserData createUserData(com.pratilipi.data.type.User user) {
    return com.pratilipi.data.util.UserDataUtil.createUserData(user, com.pratilipi.data.DataAccessorFactory.getDataAccessor().getAuthorByUserId(user.getId()));
}