public void applyDelta(fr.exensoft.cassandra.schemaupdate.comparator.delta.AbstractDelta delta) {
    session.execute(delta.generateCQL());
}