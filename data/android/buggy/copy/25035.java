@org.junit.Test
public void test2() {
    demo.Class1 class1 = new demo.Class1();
    assertFalse(((class1.add(3, 2)) == 5));
}