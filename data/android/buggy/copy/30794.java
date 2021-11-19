public boolean login(java.lang.String userName, java.lang.String password) {
    modeling.UserInfo matches = userInfoList.login(userName, password);
    if (matches != null) {
        return true;
    }else {
        return false;
    }
}