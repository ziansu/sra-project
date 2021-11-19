@org.junit.Test(expected = exception.StudentException.class)
public void testNullMotherName() throws exception.StudentException {
    java.lang.String invalidMotherName = null;
    student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, invalidMotherName, "Mário Souza Filho");
}