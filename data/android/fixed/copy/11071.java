@java.lang.Override
protected void onStop() {
    if ((mChildEventListener) != null) {
        mMessagesDatabaseReference.removeEventListener(mDeliveryChildEventListener);
        mMessagesDatabaseReferenceSecondName.removeEventListener(mChildEventListener);
    }
    super.onStop();
}