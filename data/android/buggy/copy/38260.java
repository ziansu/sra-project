public void saveContact(mg.angular.db.Contact contact) throws java.lang.ClassNotFoundException, java.sql.SQLException, mg.util.db.persist.DBValidityException {
    java.sql.Connection connection = dbConfig.getConnection();
    mg.util.db.persist.DB db = new mg.util.db.persist.DB(connection);
    db.save(contact);
}