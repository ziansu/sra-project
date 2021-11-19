public <T> void delete(T... entities) {
    for (T entity : entities)
        manager.remove(entity);
    
}