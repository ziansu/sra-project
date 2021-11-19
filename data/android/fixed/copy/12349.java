@org.junit.Test
public void listConstructorGetAllReturnsList() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    java.util.List<csd4464.a2.Student> expectedList = new java.util.ArrayList<>();
    expectedList = defaultStudentList;
    assertEquals(expectedList, c.getAll());
}