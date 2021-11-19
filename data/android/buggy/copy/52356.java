private boolean testOneFilter(java.util.List<org.apache.hawq.pxf.plugins.hive.HiveAccessor.HivePartition> partitionFields, java.lang.Object filter, org.apache.hawq.pxf.api.utilities.InputData input) {
    if (!(testForUnsupportedOperators(java.util.Arrays.asList(filter))))
        return false;
    
    return testForPartitionEquality(partitionFields, java.util.Arrays.asList(filter), input);
}