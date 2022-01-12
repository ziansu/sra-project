@java.lang.Override
public java.util.concurrent.ConcurrentNavigableMap<org.apache.hadoop.hbase.Cell, org.apache.hadoop.hbase.Cell> tailMap(org.apache.hadoop.hbase.Cell fromKey, boolean inclusive) {
    int index = getValidIndex(fromKey, (!inclusive));
    return createCellBlocks(comparator, index, maxCellIdx);
}