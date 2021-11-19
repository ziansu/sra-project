@java.lang.Override
protected void setData(final com.beimin.eveapi.response.eve.StationListResponse response) {
    net.nikr.eve.jeveasset.data.StaticData.get().setConquerableStations(response.getStations());
}