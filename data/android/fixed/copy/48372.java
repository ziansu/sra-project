@java.lang.Override
public java.util.List<java.lang.String> apply(@javax.annotation.Nullable
org.apache.hadoop.hive.ql.metadata.Partition partition) {
    if (partition == null) {
        return null;
    }
    return partition.getValues();
}