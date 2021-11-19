@java.lang.Override
protected void onPause() {
    mMessagesDatabaseReference.removeEventListener(mDeliveryChildEventListener);
    mMessagesDatabaseReferenceSecondName.removeEventListener(mChildEventListener);
    mChildEventListener = null;
    mDeliveryChildEventListener = null;
    super.onPause();
    com.george.getreadychat.UserToUserMessageNotification.isActiveNotification = false;
}