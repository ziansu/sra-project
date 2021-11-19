@org.junit.Test
public void testOffsetDate() throws no.api.meteo.MeteoException {
    java.time.ZonedDateTime zonedDateTime = no.api.meteo.util.MeteoDateUtils.fullOffsetFormatToZonedDateTime("2015-08-24T08:14:35+0200");
}