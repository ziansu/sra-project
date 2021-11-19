@java.lang.Override
public org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text> createRecordReader(org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context) throws java.io.IOException {
    java.lang.System.out.println("Create record reader");
    return new org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.Text>(((org.apache.hadoop.mapreduce.lib.input.CombineFileSplit) (split)), context, manysmalltoone.CustomCombineRecordReader.class);
}