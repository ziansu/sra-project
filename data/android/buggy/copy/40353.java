@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public <S extends T> java.lang.Iterable<S> saveAll(java.lang.Iterable<S> entities) {
    for (S entity : entities) {
        session.save(entity);
    }
    return entities;
}