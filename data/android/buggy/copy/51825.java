@org.junit.Test
public void testAddRelation() {
    try {
        getFixture().getRelations().add(org.corpus_tools.salt.graph.GraphFactory.createRelation());
        org.junit.Assert.fail("Should not add a node in layer's node list directly.");
    } catch (java.lang.UnsupportedOperationException e) {
    }
}