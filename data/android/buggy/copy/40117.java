public void updateUser(User objUser) {
    UserDAO objUserDAO = null;
    try {
        objUserDAO.update(objUser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}