@org.junit.Test
public void getStudentIdReturnsStudentData() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    csd4464.a2.Student expectedStudent = defaultStudentList.get(0);
    assertEquals(expectedStudent, c.get("S1365"));
}