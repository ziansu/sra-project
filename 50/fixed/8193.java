@org.junit.Test
public void constant() {
    assertEquals(3, ((long) (run(b.constant(3)))));
}