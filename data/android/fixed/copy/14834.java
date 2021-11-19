private void setBusinessMetadata(co.cask.cdap.data2.metadata.dataset.BusinessMetadataRecord metadataRecord, co.cask.cdap.data2.metadata.dataset.BusinessMetadataDataset.MetadataType metadataType) {
    co.cask.cdap.proto.Id.NamespacedId targetId = metadataRecord.getTargetId();
    write(targetId, metadataType, metadataRecord);
}