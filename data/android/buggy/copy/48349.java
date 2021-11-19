@org.team8.webapp.Testing.Test
public void removeUser() {
    org.team8.webapp.User.User dummy = new org.team8.webapp.User.User("dummy", "dummy", 1);
    org.team8.webapp.Testing.TestJUnitDB.userDAO.createUser(dummy);
    assertTrue(org.team8.webapp.Testing.TestJUnitDB.userDAO.removeUser(dummy.getUserId()));
}