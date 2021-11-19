public static void deleteContact(long id) {
    models.Contact contact = models.Contact.find().byId(id);
    if (contact == null) {
        throw new java.lang.RuntimeException("Unable to find contact with given ID value.");
    }
    com.avaje.ebean.Ebean.delete(contact);
}