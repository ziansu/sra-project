int getItemCount() {
    if (!(mObserving)) {
        return mAdapter.getItemCount();
    }
    return mShadowItemCount;
}