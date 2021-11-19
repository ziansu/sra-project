@java.lang.Override
public void onDestroyView() {
    if ((mPresenter) != null)
        mPresenter.onDestroy();
    
    mPresenter = null;
    super.onDestroyView();
}