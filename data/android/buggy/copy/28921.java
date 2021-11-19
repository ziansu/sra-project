@org.testng.annotations.Test
public void myFirstTestngTest() {
    int a = 1;
    int b = 2;
    int c;
    c = a + b;
    org.testng.Assert.assertTrue((c == 3));
    java.lang.System.out.println("myFirstTestngTest...");
}