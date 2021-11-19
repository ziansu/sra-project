private static void viewAll() {
    java.util.Collection<ua.skillsup.java0.phonebook.model.ContactPhoneBook> contactPhoneBooks = ua.skillsup.java0.phonebook.TestDrive.PhoneManagerTest.pm.getAllContacts();
    for (ua.skillsup.java0.phonebook.model.ContactPhoneBook contact : contactPhoneBooks) {
        java.lang.System.out.println(contact);
    }
}