boolean areSerializedFieldsEqual(org.apache.hadoop.hbase.filter.LongComparator other) {
    if (other == (this))
        return true;
    
    if (!(other instanceof org.apache.hadoop.hbase.filter.LongComparator))
        return false;
    
    return super.areSerializedFieldsEqual(other);
}