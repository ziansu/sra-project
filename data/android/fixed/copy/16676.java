private int getContactID(android.database.Cursor contactLookupCursor) {
    int phoneContactID = -1;
    if ((null != contactLookupCursor) && (contactLookupCursor.moveToFirst())) {
        phoneContactID = contactLookupCursor.getInt(contactLookupCursor.getColumnIndexOrThrow(ContactsContract.PhoneLookup._ID));
    }
    return phoneContactID;
}