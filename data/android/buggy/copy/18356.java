@java.lang.Override
protected boolean isSplitable(org.apache.hadoop.mapreduce.JobContext context, org.apache.hadoop.fs.Path file) {
    java.lang.System.out.println("Is splittable");
    return false;
}