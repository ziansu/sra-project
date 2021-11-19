@org.junit.Test
public void noArgsConstructorGetAllReturnsEmptyList() {
    csd4464.a2.Course c = new csd4464.a2.Course();
    java.util.List<csd4464.a2.Student> emptyList = new java.util.ArrayList<>();
    assertEquals(emptyList, c.getAll());
}