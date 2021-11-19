@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    this.storeDirectory = testDirectory.directory(description.getMethodName());
    org.neo4j.test.ha.ClusterRule.super.apply(base, description);
}