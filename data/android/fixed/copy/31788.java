@java.lang.Override
public void write(org.apache.hadoop.io.LongWritable v, byte[] buf, int offset) {
    com.kylinolap.common.util.BytesUtil.writeLong((v == null ? 0 : v.get()), buf, offset, com.kylinolap.metadata.measure.fixedlen.FixedPointLongCodec.SIZE);
}