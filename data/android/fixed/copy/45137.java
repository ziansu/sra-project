public static com.jaspreet.worldwidelive.mvp.presenter.MainActivityPresenter getInstance(com.jaspreet.worldwidelive.mvp.views.MainActivityMvpView mainActivityMvpView) {
    com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp.instance = new com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp(mainActivityMvpView);
    return com.jaspreet.worldwidelive.mvp.presenter.imp.MainActivityPresenterImp.instance;
}