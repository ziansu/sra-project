@java.lang.Override
@org.junit.Before
public void setUp() throws java.lang.Exception {
    super.setUp();
    user = getUser();
    userDAO.create(user);
}