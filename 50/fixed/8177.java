@java.lang.Override
protected void onStart() {
    if ((mInTransitMessage) != null) {
        mAdapter.prependMessage(mInTransitMessage);
        mMessageList.scrollToPosition(0);
    }
}