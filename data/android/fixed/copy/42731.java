public void load(java.lang.String filename) throws java.io.IOException {
    this.metaFilename = filename;
    variantMetadata = mapper.readValue(new java.io.File(filename), org.opencb.biodata.models.variant.metadata.VariantMetadata.class);
}