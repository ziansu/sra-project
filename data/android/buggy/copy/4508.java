@java.lang.Override
protected void onStop() {
    mPresenter.onDestroy();
    mPresenter = null;
    super.onStop();
}