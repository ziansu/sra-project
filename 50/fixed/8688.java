public void write(java.io.DataOutput out) throws java.io.IOException {
    org.apache.hadoop.io.Text.writeString(out, candidateRange);
    out.writeLong(rangeBegin);
    out.writeLong(rangeEnd);
}