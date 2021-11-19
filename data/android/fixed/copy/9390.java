@org.junit.Test
public void testCreate() {
    com.endava.model.User user = createUser();
    doNothing().when(entityManager).persist(user);
    genDao.create(user);
    verify(entityManager).persist(user);
}