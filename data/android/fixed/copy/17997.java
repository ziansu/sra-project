private nl.knaw.huygens.timbuctoo.model.DomainEntity getEntity(java.lang.String iname, java.lang.String id) {
    java.lang.Class<? extends nl.knaw.huygens.timbuctoo.model.DomainEntity> type = getType(iname);
    return repository.getEntityOrDefaultVariation(type, id);
}