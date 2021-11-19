public static com.jaspreet.worldwidelive.mvp.presenter.MainActivityPresenter getInstance(com.jaspreet.worldwidelive.mvp.views.MainActivityMvpView mainActivityMvpView) {
    if (null == (com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp.instance)) {
        com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp.instance = new com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp(mainActivityMvpView);
    }
    return com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp.instance;
}