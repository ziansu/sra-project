@org.junit.Test
public void testParseTime() {
    long time = java.lang.Long.parseLong("1430177653000");
    java.lang.String timeString = logic.RemindersHandler.parseTime(time);
    assertNotNull(timeString);
}