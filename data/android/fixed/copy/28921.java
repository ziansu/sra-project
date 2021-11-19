@org.testng.annotations.Test
public void myFirstTestngTest() {
    int a = 3;
    int b = 2;
    int c;
    c = a + b;
    org.testng.Assert.assertEquals(c, 3);
    java.lang.System.out.println("myFirstTestngTest...");
}