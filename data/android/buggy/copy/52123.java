@org.junit.Test
public void testMaxMany() {
    for (int i = 0; i < (testStringsSingleRotate.length); ++i) {
        tree.add(testStringsSingleRotate[i]);
    }
    assertEquals("Z", tree.max());
}