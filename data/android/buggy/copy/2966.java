@org.junit.Test
public void test() {
    Jenkins_Test.Module_A module_a = new Jenkins_Test.Module_A();
    assertEquals("This should return 1", (-1), module_a.return_num());
    assertEquals("This should return 2", 2, module_a.return_num());
}