@org.junit.Test
public void deleteBuckets() {
    java.util.List<java.lang.String> strings = com.bgu.dsp.awsUtils.S3Utils.deleteAllS3();
    org.junit.Assert.assertFalse(strings.contains("dsp-jars"));
}