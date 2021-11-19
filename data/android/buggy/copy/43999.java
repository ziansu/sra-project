@org.springframework.transaction.annotation.Transactional
public void update(final T dao) {
    this.em.merge(dao);
}