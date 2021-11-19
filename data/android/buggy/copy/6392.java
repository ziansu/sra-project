@org.junit.Test(expected = exception.StudentException.class)
public void testNonLettersFatherName() throws exception.StudentException {
    java.lang.String invalidFatherName = "Mário 123";
    student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", invalidFatherName);
}