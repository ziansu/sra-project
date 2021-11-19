@org.junit.Test
public void changeDePhonebookControllerDeveEnviarUmaPhonebookAlterada() {
    try {
        assertTrue(phonebookController.change(contact.getNome(), contact));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}