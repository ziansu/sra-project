@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.isViewAttached()) {
        com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.getView().showError(e, pullToRefresh);
    }
}