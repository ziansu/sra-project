@java.lang.Override
protected void setup(com.bigdata.Context context) throws java.io.IOException, java.lang.InterruptedException {
    org.apache.hadoop.conf.Configuration conf = context.getConfiguration();
    numOfPage = conf.getInt("numOfPage", (-1));
    super.setup(context);
}