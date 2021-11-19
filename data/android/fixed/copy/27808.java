@java.lang.Override
public long count(org.springframework.data.domain.Example<E> example) {
    return repository.count(example);
}