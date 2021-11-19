public void applyDelta(fr.exensoft.cassandra.schemaupdate.comparator.delta.AbstractDelta delta) {
    fr.exensoft.cassandra.schemaupdate.ResultSet result = session.execute(delta.generateCQL());
    fr.exensoft.cassandra.schemaupdate.CassandraConnection.LOGGER.info(result.toString());
}