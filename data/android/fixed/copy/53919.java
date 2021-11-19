@java.lang.Override
public void onResume() {
    super.onResume();
    mPresenter.onStart(isInstanceCreated);
    isInstanceCreated = true;
}