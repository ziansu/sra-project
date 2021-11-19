@java.lang.Deprecated
public static org.apache.parquet.hadoop.metadata.ParquetMetadata readParquetMetadata(java.io.InputStream from) throws java.io.IOException {
    return org.apache.parquet.format.converter.ParquetMetadataConverter.readParquetMetadata(from, org.apache.parquet.format.converter.ParquetMetadataConverter.NO_FILTER);
}