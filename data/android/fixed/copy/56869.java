@java.lang.Override
protected void onReset() {
    super.onReset();
    this.onStopLoading();
    if ((this.result) != null) {
        this.result = null;
    }
    this.mObserver.unregisterForContentChanges(this.getContext());
}