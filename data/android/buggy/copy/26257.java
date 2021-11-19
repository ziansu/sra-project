public java.util.List<org.iish.hsn.invoer.service.Adrestp> findMatchingAdrestypes(java.lang.String type) {
    return adrestpRepository.findByCodeOrTypeLike(((type.trim()) + "%"), WorkOrder.EMPTY_WORKORDER, inputMetadata.getWorkOrder());
}