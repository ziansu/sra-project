@org.junit.Test
public void testParse() {
    assertEquals(tec.uom.se.unit.MetricPrefix.KILO(tec.uom.se.unit.Units.GRAM), tec.uom.se.AbstractUnit.parse("kg"));
}