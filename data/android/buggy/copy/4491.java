static java.util.List<org.apache.parquet.format.SchemaElement> toParquetSchema(org.apache.parquet.schema.MessageType schema) {
    java.util.List<org.apache.parquet.format.SchemaElement> result = new java.util.ArrayList<org.apache.parquet.format.SchemaElement>();
    org.apache.parquet.format.converter.ParquetMetadataConverter.addToList(result, schema);
    return result;
}