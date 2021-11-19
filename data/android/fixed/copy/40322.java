public T find(int entityID) {
    return em.find(entityClass, entityID);
}