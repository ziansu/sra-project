@org.junit.Test
public void changeDePhonebookDAODeveEnviarUmContato() {
    try {
        assertTrue(phonebookDAO.change(contact.getNome(), contact, contact2));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}