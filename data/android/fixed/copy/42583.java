public byte[] toBytes() {
    if (metadataMap.isEmpty()) {
        return null;
    }
    java.lang.String metadataString = org.apache.rya.api.domain.StatementMetadata.gson.toJson(metadataMap);
    return metadataString.getBytes();
}