@java.lang.Override
public <S extends E> S findOne(org.springframework.data.domain.Example<S> example) {
    return repository.findOne(example);
}