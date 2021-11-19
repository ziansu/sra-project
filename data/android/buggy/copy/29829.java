@java.lang.Override
public gobblin.source.extractor.Extractor<org.apache.avro.Schema, org.apache.avro.generic.GenericRecord> getExtractor(gobblin.configuration.WorkUnitState state) throws java.io.IOException {
    try {
        return new gobblin.source.extractor.extract.kafka.KafkaAvroExtractor(state);
    } catch (gobblin.metrics.kafka.SchemaNotFoundException e) {
        throw new java.io.IOException(e);
    }
}