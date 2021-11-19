public boolean checkUserName(java.lang.String userName) {
    org.hibernate.Query query = getCurrentSession().createQuery("select count(*) from User as user where user.userName = :userName");
    query.setString("userName", userName);
    return ((java.lang.Long) (query.uniqueResult())) > 0;
}