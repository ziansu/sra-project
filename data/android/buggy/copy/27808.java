@java.lang.Override
public <S extends E> long count(org.springframework.data.domain.Example<S> example) {
    return repository.count(example);
}