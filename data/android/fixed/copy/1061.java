@java.lang.Override
public void onPause() {
    super.onPause();
    mSession.getDataHandler().removeListener(mEventsListener);
    im.vector.contacts.ContactsManager.removeListener(mContactsListener);
}