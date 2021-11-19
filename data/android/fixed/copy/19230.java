@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    storage = com.johnsimon.payback.storage.StorageManager.getStorage(this);
    contactLoader = com.johnsimon.payback.loader.ContactLoader.getLoader(this);
    dataLink = new com.johnsimon.payback.util.DataLinker().link(storage.subscription, contactLoader.contactsLoaded);
}