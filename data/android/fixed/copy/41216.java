@org.junit.Test(expected = exception.StudentException.class)
public void testEmptyMotherName() throws exception.StudentException {
    java.lang.String invalidMotherName = "";
    student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, invalidMotherName, "Mário Souza Filho", 1);
}