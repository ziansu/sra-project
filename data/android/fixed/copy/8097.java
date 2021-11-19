private Contact getContact(java.lang.String name) {
    for (Contact contact : contacts.values()) {
        if (contact.getName().equals(name)) {
            return contact;
        }
    }
    return new Contact();
}