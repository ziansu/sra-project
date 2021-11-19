@org.junit.Test
public void setupMenu() {
    presenter.setupMenu();
    org.mockito.Mockito.verify(mainView, org.mockito.Mockito.times(1)).setup();
}