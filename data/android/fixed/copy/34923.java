@org.junit.Test
public void testHello() {
    java.lang.System.out.println("Run hello test");
    assertEquals("Run hello test", com.tvntd.test.SideBarTest.outContent.toString());
}