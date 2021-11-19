public boolean updateUserInformation(com.thoughtworks.spring.jpa.tomcat.entities.User user) {
    int updateCounts = userDao.updateUserInformation(user);
    if (updateCounts >= 0)
        return true;
    
    return false;
}