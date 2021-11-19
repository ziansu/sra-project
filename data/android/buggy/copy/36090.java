public void deleteByIds(java.util.List<java.lang.Long> ids) {
    for (java.lang.Long id : ids) {
        priceRepository.delete(id);
    }
}