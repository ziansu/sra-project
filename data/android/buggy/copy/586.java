public static boolean hasAccessToAddOrUpdateUserAuthorData(com.pratilipi.data.client.UserAuthorData userAuthorData) {
    return userAuthorData.equals(com.pratilipi.filter.AccessTokenFilter.getAccessToken().getUserId());
}