@java.lang.Override
public ru.javawebinar.topjava.model.Meal get(int userId, int id) throws ru.javawebinar.topjava.util.exception.NotFoundException {
    return ru.javawebinar.topjava.util.ValidationUtil.checkNotFoundWithId(repository.get(id), id);
}