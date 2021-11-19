public void removeEntity(com.tskbdx.sumimasen.scenes.model.entities.Entity entity) {
    entity.setWorld(null);
    entitiesByName.remove(entity.getName());
    setChanged();
    notifyObservers(entity);
}