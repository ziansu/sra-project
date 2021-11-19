@org.junit.Before
public void setUp() {
    com.juliasoft.beedeedee.factories.ResizingAndGarbageCollectedFactoryImpl factoryMock = mock(com.juliasoft.beedeedee.factories.ResizingAndGarbageCollectedFactoryImpl.class);
    ut = new com.juliasoft.beedeedee.factories.ResizingAndGarbageCollectedUniqueTable(10, 10, factoryMock);
}