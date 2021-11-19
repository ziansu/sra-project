@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mPresenter) != null) {
        mPresenter.start();
    }
}