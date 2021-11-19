@java.lang.Override
protected void prepare() throws at.bitfire.vcard4android.ContactsStorageException {
    journal = new at.bitfire.davdroid.journalmanager.JournalEntryManager(httpClient, remote, localCalendar().getName());
}