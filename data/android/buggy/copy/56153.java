@java.lang.Override
public java.lang.Iterable<org.terasology.entitySystem.entity.EntityRef> getAllEntities() {
    org.terasology.entitySystem.entity.internal.PojoEntityManager.logger.info("hi from PojoEntityManager");
    return () -> new org.terasology.entitySystem.entity.internal.PojoEntityManager.EntityIterator(globalStore.getStore().entityIdIterator());
}