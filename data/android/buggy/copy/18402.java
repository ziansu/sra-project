@org.junit.Test
public void getStudentByIndexReturnsStudentData() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    csd4464.a2.Student expectedStudent = defaultStudentList.get(3);
    assertEquals(c.get(3), expectedStudent);
}