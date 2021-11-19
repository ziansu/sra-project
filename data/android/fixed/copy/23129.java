@java.lang.Override
public gobblin.data.management.copy.hive.HivePartitionExtendedFilter createFilter(com.typesafe.config.Config config) {
    java.util.Properties props = gobblin.util.ConfigUtils.configToProperties(config);
    return props.containsKey(gobblin.data.management.copy.hive.PathBasedHivePartitionFilterFactory.HIVE_PARTITION_PATH_FILTER_REGEX) ? new gobblin.data.management.copy.hive.PathBasedPartitionFilter(props.getProperty(gobblin.data.management.copy.hive.PathBasedHivePartitionFilterFactory.HIVE_PARTITION_PATH_FILTER_REGEX)) : null;
}