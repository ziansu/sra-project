protected void addEntityInternal(com.badlogic.ashley.core.Entity entity) {
    entities.add(entity);
    entitiesById.put(entity.getId(), entity);
    updateFamilyMembership(entity, false);
    entity.componentAdded.add(componentAdded);
    entity.componentRemoved.add(componentRemoved);
}