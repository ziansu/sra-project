@java.lang.Override
public void onValidStart() {
    mPresenter.initializeMercadoPago();
    initializeViews();
    loadViews();
    hideHeader();
    decorate();
    showTimer();
    initializeAdapter();
    mPresenter.loadIssuers();
}