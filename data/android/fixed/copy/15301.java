@java.lang.Override
public void deleteAttribute(org.molgenis.data.meta.model.EntityType entityType, org.molgenis.data.meta.model.Attribute attr) {
    org.molgenis.data.meta.model.EntityType updatedEntityType = entityTypeCopier.copy(entityType);
    updatedEntityType.removeAttribute(attr);
    entityTypeRegistry.registerEntityType(updatedEntityType);
    repoCollection.deleteAttribute(entityType, attr);
}