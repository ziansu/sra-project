@org.junit.Before
public void setup() throws java.io.IOException {
    engine = new org.neo4j.cypher.javacompat.ExecutionEngine(new org.neo4j.test.TestGraphDatabaseFactory().newImpermanentDatabase(), new org.neo4j.cypher.internal.spi.v2_2.DefaultLogger(logger));
}