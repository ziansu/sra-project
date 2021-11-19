@java.lang.Deprecated
public org.apache.parquet.hadoop.metadata.ParquetMetadata readParquetMetadata(java.io.InputStream from) throws java.io.IOException {
    return readParquetMetadata(from, org.apache.parquet.format.converter.ParquetMetadataConverter.NO_FILTER);
}