@java.lang.SuppressWarnings(value = "unchecked")
public org.springframework.data.domain.Page<com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAddress> getAllHousingUnitAddress(java.util.UUID housingUnitId, org.springframework.data.domain.Pageable pageable) {
    java.util.List<com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAddress> housingUnitAddress = new java.util.ArrayList<com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAddress>(0);
    com.hserv.coordinatedentry.housinginventory.domain.HousingInventory housingInventory = housingInventoryRepository.findOne(housingUnitId);
    return housingUnitAddressRepository.findByHousingInventory(housingInventory, pageable);
}