public byte[] toBytes() {
    java.lang.String metadataString = org.apache.rya.api.domain.StatementMetadata.gson.toJson(metadataMap);
    return metadataString.getBytes();
}