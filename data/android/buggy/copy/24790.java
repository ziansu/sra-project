@java.lang.Override
public synchronized void close(final org.apache.hadoop.mapreduce.TaskAttemptContext context) throws java.io.IOException, java.lang.InterruptedException {
    this.writer.close();
}