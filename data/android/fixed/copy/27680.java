public long getUserID(java.lang.String username, java.lang.String password) {
    if (userDAO.isRegistered(username, password)) {
        return userDAO.getID(username);
    }else {
        return 0;
    }
}