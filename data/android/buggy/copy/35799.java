@org.junit.Test
public void compareStartTime_NullTarget() {
    java.time.LocalTime sourceEnd = java.time.LocalTime.of(12, 0);
    raijin.common.datatypes.DateTime source = new raijin.common.datatypes.DateTime(null, sourceEnd);
    assertEquals(1, source.compareStartTime(sourceEnd, null));
}