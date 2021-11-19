public java.util.List<org.iish.hsn.invoer.service.Kg> findMatchingKg(java.lang.String kerkgeno) {
    return kgRepository.findByKerkgenoLike((kerkgeno + "%"), WorkOrder.EMPTY_WORKORDER, inputMetadata.getWorkOrder());
}