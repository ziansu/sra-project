@org.junit.Before
public void init() {
    org.mockito.Mockito.when(entityManagerFactory.createEntityManager()).thenReturn(entityManager);
    org.mockito.Mockito.when(entityManager.getTransaction()).thenReturn(entityTransaction);
}