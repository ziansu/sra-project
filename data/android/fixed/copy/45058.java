@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public E save(E entity) {
    return repository.save(entity);
}