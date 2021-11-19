public audio.metadata.Metadata getMetadata(audio.metadata.MetadataType type) {
    for (audio.metadata.Metadata metadata : mMetadata) {
        if ((metadata.getMetadataType()) == type) {
            return metadata;
        }
    }
    return null;
}