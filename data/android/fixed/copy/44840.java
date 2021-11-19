@org.junit.Test
public void changeDePhonebookControllerDeveEnviarUmaPhonebookAlterada() {
    try {
        assertTrue(phonebookController.change(contact.getName(), contact));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}