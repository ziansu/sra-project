@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    org.powermock.api.mockito.PowerMockito.mockStatic(org.unicef.rapidreg.utils.EncryptHelper.class);
}