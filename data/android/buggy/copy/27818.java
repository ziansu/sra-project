@java.lang.Override
public void delete(int userId, int id) throws ru.javawebinar.topjava.util.exception.NotFoundException {
    ru.javawebinar.topjava.util.ValidationUtil.checkNotFoundWithId(repository.delete(id), id);
}