@org.junit.Test
public void testGetInstanceImmutableBytesWritable() {
    org.apache.hadoop.hbase.io.ImmutableBytesWritable ptr = new org.apache.hadoop.hbase.io.ImmutableBytesWritable(org.apache.hadoop.hbase.util.Bytes.toBytes("Europe/Isle_of_Man"));
    org.joda.time.DateTimeZone instance = org.apache.phoenix.cache.JodaTimezoneCache.getInstance(ptr);
    org.junit.Assert.assertNotNull(instance);
}