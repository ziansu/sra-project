public boolean checkEmailExists(java.lang.String email) {
    return (registerDao.checkEmailExists(email)) > 0;
}