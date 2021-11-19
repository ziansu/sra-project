public org.springframework.data.domain.Page<com.es.masjid.madmin.model.Item> findAllItems(com.es.masjid.madmin.model.ItemType itemType, org.springframework.data.domain.Pageable pageRequest) {
    return genericItemRepository.findAllItems(itemType, pageRequest);
}