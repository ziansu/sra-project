@org.junit.Test
public void Show_Fragment() {
    presenter.displayFragment(2);
    org.mockito.Mockito.verify(mainView, org.mockito.Mockito.times(1)).showFragment(2);
}