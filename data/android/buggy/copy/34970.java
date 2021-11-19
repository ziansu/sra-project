@org.junit.Test
public void testGetInstanceByteBufferUTC() {
    org.joda.time.DateTimeZone instance = org.apache.phoenix.cache.JodaTimezoneCache.getInstance(java.nio.ByteBuffer.wrap(org.apache.hadoop.hbase.util.Bytes.toBytes("UTC")));
    org.junit.Assert.assertTrue((instance instanceof org.joda.time.DateTimeZone));
}