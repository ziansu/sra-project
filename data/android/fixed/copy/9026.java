@org.junit.Before
public void setUp() {
    if ((viewModel) == null) {
        viewModel = new ru.unn.agile.Complex.viewmodel.ViewModel(new ru.unn.agile.Complex.viewmodel.FakeLogger());
    }
}