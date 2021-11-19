@org.junit.Test
public void testConvertNine() {
    expected = "IX";
    converter.ConverterEngine converterEngine = new converter.ConverterEngine();
    actual = converterEngine.convert(9);
    java.lang.System.out.println(("NINE::: Actual " + (actual)));
    assertEquals(expected, actual);
}