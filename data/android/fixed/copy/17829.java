@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mPresenter.copy(mAskAdapter.getItem(((java.lang.Integer) (v.getTag()))));
    return true;
}