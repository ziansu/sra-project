private static void setupDefaultFileForStorage() {
    seedu.addressbook.AddressBook.showToUser(seedu.addressbook.AddressBook.MESSAGE_USING_DEFAULT_FILE);
    seedu.addressbook.AddressBook.storageFilePath = seedu.addressbook.AddressBook.DEFAULT_STORAGE_FILEPATH;
    seedu.addressbook.AddressBook.createFileIfMissing(seedu.addressbook.AddressBook.storageFilePath);
}