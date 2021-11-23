@java.lang.Override
public T load(java.lang.Long id) {
    return this.boFacade.getEntityManager().find(this.boType, id);
}