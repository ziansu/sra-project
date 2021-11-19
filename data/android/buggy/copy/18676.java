public java.util.List<pojo.User> showAllUsers() {
    java.util.List<pojo.User> allUsers = new java.util.ArrayList<>();
    allUsers.addAll(userDao.getAllUser());
    return allUsers;
}