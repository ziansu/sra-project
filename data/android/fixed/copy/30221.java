@org.junit.Test
public void setView() {
    presenter.clearView();
    presenter.setView(mainView);
    org.junit.Assert.assertEquals(presenter.getView(), mainView);
}