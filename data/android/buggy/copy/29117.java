@org.junit.Before
public void setup() throws org.neo4j.causalclustering.core.state.ClusterStateException {
    clusterStateDirectory.initialize(fsa);
}