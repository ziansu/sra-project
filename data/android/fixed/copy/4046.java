public void deleteDisaster(java.lang.Long id) {
    disasterRepository.delete(disasterRepository.findById(id).get());
}