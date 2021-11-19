@org.junit.Test
public void showThreeWordFilteredLog() {
    mPresenter.logFilterChanged("test 1 2");
    org.mockito.Mockito.verify(mView).showLog("test1ing2\ntest21\n2i1sATeSt\n");
}