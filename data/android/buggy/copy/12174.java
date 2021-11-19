@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    assetService = new com.thoughtworks.fam.service.AssetService(assetRepository, userRepository);
}