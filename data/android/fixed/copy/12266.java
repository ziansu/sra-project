public void unbind() {
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    if ((mPresenter) != null) {
        mPresenter.unsubscribe();
    }
}