@java.lang.Override
public void done(java.util.List<com.terpsync.parse.UMDBuildings> arg0, com.parse.ParseException arg1) {
    com.terpsync.parse.UMDBuildings building = arg0.get(0);
    updateMarker(building, true);
}