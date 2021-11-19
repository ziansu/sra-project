@org.junit.Before
public void setup() {
    testDatabase = new com.distroguy.jContacts.Database(com.distroguy.jContacts.TestDatabase.TESTFILE);
    java.util.ArrayList<com.distroguy.jContacts.Contact> contactList = new java.util.ArrayList<com.distroguy.jContacts.Contact>();
    testOrganiser = new com.distroguy.jContacts.Organiser();
}