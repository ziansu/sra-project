@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.util.List<E> save(java.lang.Iterable<E> entities) {
    return repository.save(entities);
}