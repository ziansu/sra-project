@cucumber.api.java.Before
public void init() {
    testON = uk.co.ordnancesurvey.gpx.graphhopper.IntegrationTestProperties.getTestProperty("testON");
    graphUiUtil = new uk.co.ordnancesurvey.routing.GraphHopperUIUtil(uk.co.ordnancesurvey.gpx.graphhopper.IntegrationTestProperties.getTestProperty("graphHopperWebUrl"));
}