@java.lang.Override
public float getProgress() throws java.io.IOException, java.lang.InterruptedException {
    return ((float) (((org.apache.hadoop.fs.FSDataInputStream) (incoming)).getPos())) / (size);
}