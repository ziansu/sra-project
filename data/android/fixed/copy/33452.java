@org.junit.Test
public void testGetDepartingFlights() {
    com.csanon.server.WPIFlightServer server = new com.csanon.server.WPIFlightServer(new com.csanon.server.ServerConfig());
    java.lang.String result = server.getFlightsDeparting("BOS", "2016_05_10");
    assertTrue(((result.length()) > 0));
}