@org.junit.Before
public void setUp() throws java.lang.Exception {
    distributedClusterStore = new org.onosproject.store.cluster.impl.DistributedClusterStore();
    distributedClusterStore.activate();
}