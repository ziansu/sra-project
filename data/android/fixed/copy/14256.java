void registerObserversIfNecessary() {
    if ((mRegisteredDataObserver) == null) {
        mRegisteredDataObserver = mDataObserver;
        mAdapter.registerDataObserver(mDataObserver);
    }
}