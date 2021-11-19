private java.lang.String buildUserInfoDisplay(com.facebook.model.GraphUser user) {
    java.lang.StringBuilder userInfo = new java.lang.StringBuilder("");
    userInfo.append(java.lang.String.format("%s", user.getId()));
    return userInfo.toString();
}