@java.lang.Override
public void close() throws java.io.IOException {
    htsjdk.samtools.util.CloserUtil.close(reader);
    this.reader = null;
}