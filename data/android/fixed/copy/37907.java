@org.junit.Test
public void testGet_int() {
    list.add(null, "1", "2", "3");
    assertEquals("1", list.get(1));
}