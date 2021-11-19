@java.lang.Override
public void onNext(M data) {
    if (com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.isViewAttached()) {
        com.hannesdorfmann.mosby.mvp.rx.MvpLceRxPresenter.getView().setData(data);
    }
}