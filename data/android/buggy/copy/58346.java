public RecordReader<LongWritable, Text> getRecordReader(InputSplit split, JobConf conf, Reporter reporter) {
    reporter.setStatus(split.toString());
    return new Ngram.PageRecordReader(job, ((FileSplit) (input)));
}