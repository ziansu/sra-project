@java.lang.Override
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
public E saveAndCommit(E entity) {
    return saveAndFlush(entity);
}