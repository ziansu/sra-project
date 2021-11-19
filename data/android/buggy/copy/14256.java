void registerObserversIfNecessary() {
    if ((mRegisteredDataObserver) == null) {
        mAdapter.registerDataObserver(mDataObserver);
        mRegisteredDataObserver = mDataObserver;
    }
}