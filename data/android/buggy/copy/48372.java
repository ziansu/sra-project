@java.lang.Override
public java.util.List<java.lang.String> apply(org.apache.hadoop.hive.ql.metadata.Partition partition) {
    return partition.getValues();
}