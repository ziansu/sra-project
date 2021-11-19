@org.junit.Test
public void testHello() {
    java.lang.System.out.print("Run hello test");
    assertEquals("Run hello test", com.tvntd.test.SideBarTest.outContent.toString());
}