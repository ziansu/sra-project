@org.junit.Test
public void parser_valid() {
    assertEquals("00:00", new Interval.Countdown("0:00", null).toReadableString());
    assertEquals("10:15", new Interval.Countdown("10:15", null).toReadableString());
}