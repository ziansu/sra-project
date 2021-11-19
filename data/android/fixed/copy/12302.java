@java.lang.Override
public int computeAvailableContainers(org.apache.hadoop.yarn.api.records.Resource available, org.apache.hadoop.yarn.api.records.Resource required) {
    if ((required.getMemory()) == 0) {
        return available.getMemory();
    }
    return (available.getMemory()) / (required.getMemory());
}