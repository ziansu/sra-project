@org.springframework.transaction.annotation.Transactional
public <T> T update(final T dao) {
    return this.em.merge(dao);
}