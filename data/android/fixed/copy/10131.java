@java.lang.Override
public boolean exists(org.springframework.data.domain.Example<E> example) {
    return repository.exists(example);
}