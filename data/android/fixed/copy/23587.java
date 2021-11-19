public void deleteByUserId(java.lang.Long userId) {
    contactRepository.delete(userId);
}