@org.junit.Before
public void setUp() {
    org.mockito.MockitoAnnotations.initMocks(this);
    mPresenter = org.mockito.Mockito.spy(new viper.Presenter<viper.ViewCallbacks, viper.Router>() {    });
}