@org.junit.Test
public void showThreeWordFilteredLog() {
    mPresenter.logFilterChanged("test 1 2", "tes\ntest1ing2\n1tet\n2test_\ntest1\ntest21\n2i1sATeSt");
    org.mockito.Mockito.verify(mView).showLog("test1ing2\ntest21\n2i1sATeSt\n");
}