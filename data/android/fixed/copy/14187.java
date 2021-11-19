@org.junit.Test
public void testNewlineBetweenNumbers() {
    org.junit.Assert.assertEquals(6, is.ru.stringcalculator.Calculator.add("1\n2,3"));
    org.junit.Assert.assertEquals(7, is.ru.stringcalculator.Calculator.add("2,2\n3"));
    org.junit.Assert.assertEquals(9, is.ru.stringcalculator.Calculator.add("2,3\n4"));
}