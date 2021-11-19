@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (serviceBound) {
        unbindService(serviceConnection);
    }
    if (!(disposable.isDisposed())) {
        disposable.dispose();
    }
    disposable1.dispose();
}