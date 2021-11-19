@org.junit.Test
public void subtractingNegativeWorks() {
    int a = 23;
    int b = a - -1;
    assertEquals(24, b);
}