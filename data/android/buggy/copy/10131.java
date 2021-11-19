@java.lang.Override
public <S extends E> boolean exists(org.springframework.data.domain.Example<S> example) {
    return repository.exists(example);
}