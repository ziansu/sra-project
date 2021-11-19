public void createUser(User objUser) {
    UserDAO objUserDAO = null;
    try {
        objUserDAO = new UserDAO();
        objUserDAO.insert(objUser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}