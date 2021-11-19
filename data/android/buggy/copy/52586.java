public void editEmail(java.lang.String email) throws seedu.addressbook.data.exception.IllegalValueException {
    this.email = new seedu.addressbook.data.person.Email(email, false);
}