public static java.util.List<Sighting> all() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "SELECT * FROM sightings;";
        return con.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Sighting.class);
    }
}