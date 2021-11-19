private java.lang.Long getCurrentUserId() {
    java.lang.String userName = com.baidu.broadcast.security.SpringSecurityUtils.getCurrentUser().getUsername();
    com.baidu.broadcast.userdemo.entity.User loginUser = userDao.findUniqueBy("loginName", userName);
    return java.lang.Long.valueOf(loginUser.getId());
}