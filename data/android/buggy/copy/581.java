@org.junit.Test(expected = exception.StudentException.class)
public void testInvalidStudentPhone1() throws exception.StudentException {
    student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, null, phone2, "Milene Souza Medeiros", "Mário Souza Filho");
}