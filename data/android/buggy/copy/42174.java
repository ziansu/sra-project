@java.lang.Override
public testJpa.simple.table.domain.SimpleTable save(final testJpa.simple.table.domain.SimpleTable entity) {
    final testJpa.simple.table.domain.SimpleTable st = em.merge(entity);
    return st;
}