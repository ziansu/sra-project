@java.lang.Override
public <S extends E> java.util.List<S> findAll(org.springframework.data.domain.Example<S> example, org.springframework.data.domain.Sort sort) {
    return repository.findAll(example, sort);
}