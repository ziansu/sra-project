public static void setAvroDataSupplier(org.apache.hadoop.conf.Configuration configuration, java.lang.Class<? extends org.apache.parquet.avro.AvroDataSupplier> suppClass) {
    configuration.set(org.apache.parquet.avro.AvroWriteSupport.AVRO_DATA_SUPPLIER, suppClass.getName());
}