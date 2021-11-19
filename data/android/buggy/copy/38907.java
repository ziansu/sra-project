@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    org.mockito.Mockito.when(dataManager.getDatabaseHelper()).thenReturn(databaseOpenHelper);
    org.mockito.Mockito.when(databaseOpenHelper.getPlaceDao()).thenReturn(mockPlaceDao);
}