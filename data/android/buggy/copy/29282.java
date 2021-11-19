@org.junit.Test
public void compareStartTime_NullSource() {
    java.time.LocalTime targetEnd = java.time.LocalTime.of(12, 0);
    raijin.common.datatypes.DateTime source = new raijin.common.datatypes.DateTime(null, targetEnd);
    assertEquals((-1), source.compareStartTime(null, targetEnd));
}