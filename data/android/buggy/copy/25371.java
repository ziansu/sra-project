@org.junit.Test(expected = com.tsystems.jschool.railage.service.exceptions.IncorrectStationsDepartureTimesOrderException.class)
public void testValidateTimes9() throws java.lang.Exception {
    params.setTimes(java.util.Arrays.asList("8:07", "15:30", "17:22", "20:30", "0:20"));
    params.validateTimes();
}