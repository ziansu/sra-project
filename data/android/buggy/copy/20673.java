public void setAttribute(java.lang.String name, java.lang.String value) throws ie.petem.AddressBook.model.ContactMethods.ValidationException {
    if (validate(value))
        super.setValue(name, value);
    
}