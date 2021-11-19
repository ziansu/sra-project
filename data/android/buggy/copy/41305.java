public void testIsElementOfOperableType() throws java.lang.Exception {
    il.org.spartan.ispartanizer.plugin.Toolbox instance = il.org.spartan.ispartanizer.plugin.Toolbox.getInstance();
    assertFalse(instance.isElementOfOperableType(createTestNullExpression()));
    assertTrue(instance.isElementOfOperableType(createTestMethodFromString("int banana() { return 5;}")));
}