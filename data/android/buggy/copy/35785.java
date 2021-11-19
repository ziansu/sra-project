java.util.Collection<qasystem.persistence.entities.Question> findAllByUserId(java.lang.String id) {
    java.lang.Long lUserId = java.lang.Long.getLong(id);
    return questionRepository.findAllByUserId(lUserId);
}