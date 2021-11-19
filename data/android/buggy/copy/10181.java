@java.lang.Override
public testJpa.simple.table.domain.SimpleTable findOne(final java.lang.Long id) {
    final testJpa.simple.table.domain.SimpleTable entity = em.find(testJpa.simple.table.domain.SimpleTable.class, id);
    return entity;
}