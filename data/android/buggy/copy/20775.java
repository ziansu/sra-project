@org.junit.Test
public void testStationData() throws java.io.IOException, org.apache.http.ParseException {
    java.lang.String responseString = new net.climatecharts.WeatherStations().getStationData(stationID, minYear, maxYear);
    java.lang.System.out.println(responseString.substring(0, 512));
}