public void modify(my.javapr.addressbook.model.ContactData contact) {
    initContactModificationById(contact.getId());
    fillContactForm(contact);
    submitContactModification();
    returnToHomePage();
}