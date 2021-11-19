@java.lang.Override
public java.lang.Iterable<org.terasology.entitySystem.entity.EntityRef> getAllEntities() {
    return () -> new org.terasology.entitySystem.entity.internal.PojoEntityManager.EntityIterator(globalStore.getStore().entityIdIterator());
}