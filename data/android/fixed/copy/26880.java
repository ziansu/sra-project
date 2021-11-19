@java.lang.Override
protected boolean prepare() throws at.bitfire.vcard4android.ContactsStorageException {
    journal = new at.bitfire.davdroid.journalmanager.JournalEntryManager(httpClient, remote, localCalendar().getName());
    return true;
}