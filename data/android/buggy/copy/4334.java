@org.junit.Test
public void equalsNotCourseObjectReturnsFalse() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    assertEquals(c.equals("Banana Stand"), false);
}