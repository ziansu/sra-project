@java.lang.Override
public int compareTo(org.apache.hadoop.hbase.filter.MultiRowRangeFilter.RowRange other) {
    return org.apache.hadoop.hbase.util.Bytes.compareTo(this.startRow, other.startRow);
}