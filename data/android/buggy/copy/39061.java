@org.junit.Before
public void setUp() {
    eu.pawelsz.apache.beam.io.protoio.ProtoIOCloudStorageTest.opts = org.apache.beam.sdk.options.PipelineOptionsFactory.create();
    eu.pawelsz.apache.beam.io.protoio.ProtoIOCloudStorageTest.opts.setRunner(org.apache.beam.runners.direct.DirectRunner.class);
    source = eu.pawelsz.apache.beam.io.protoio.ProtoIOSource.from(Data.RawItem.class, eu.pawelsz.apache.beam.io.protoio.ProtoIOCloudStorageTest.testFilePath);
}