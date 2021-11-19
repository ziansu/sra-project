@org.junit.Test
public void testAvro() throws java.io.IOException {
    run(new com.cloudera.crunch.impl.mr.MRPipeline(com.cloudera.crunch.WordCountTest.class), com.cloudera.crunch.type.avro.AvroTypeFamily.getInstance(), false);
}