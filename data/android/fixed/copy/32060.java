public void onFinish() {
    if (mRegistered) {
        com.alexvasilkov.events.Events.unregister(mActivity);
    }
    com.alexvasilkov.events.ActivityEvents.removeUidFromUsed(mUid);
    mRegistered = false;
}