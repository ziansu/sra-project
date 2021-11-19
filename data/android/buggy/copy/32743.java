public void addFollowing(java.lang.String uidFollower, java.lang.String uidFollowing) {
    fr.epsi.tp.ws.dao.UserDao userDao = new fr.epsi.tp.ws.dao.impl.UserDaoImpl();
    userDao.addFollowingById(uidFollower, uidFollowing);
}