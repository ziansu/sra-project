@java.lang.Override
public void onResume() {
    super.onResume();
    mPresenter.onStart(false);
    isInstanceCreated = true;
}