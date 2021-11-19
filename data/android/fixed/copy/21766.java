public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getAllTracksDAO(java.lang.String query) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    com.mixtri.tracks.TrackDB trackdb = new com.mixtri.tracks.TrackDB();
    return trackdb.getAllTracksDB(query);
}