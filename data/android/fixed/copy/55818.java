@java.lang.Override
public org.calrissian.mango.collect.CloseableIterable<org.calrissian.mango.domain.entity.Entity> get(java.util.Collection<org.calrissian.mango.domain.entity.EntityIdentifier> typesAndIds, org.calrissian.accumulorecipes.commons.domain.Auths auths) {
    return get(typesAndIds, null, auths);
}