@org.junit.Test
public void setIdSetIdTest() {
    edu.msudenver.cs3250.group6.msubanner.Course course = new edu.msudenver.cs3250.group6.msubanner.Course();
    course.setId((-1));
    assertEquals((-1), course.getId());
}