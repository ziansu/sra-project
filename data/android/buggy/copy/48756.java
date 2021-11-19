@java.lang.Override
public java.util.List<ru.javawebinar.topjava.model.User> getAll() {
    return crudRepository.findAll(ru.javawebinar.topjava.repository.datajpa.DataJpaUserRepositoryImpl.SORT_NAME_EMAIL);
}