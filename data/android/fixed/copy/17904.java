public ru.javawebinar.topjava.model.User create(ru.javawebinar.topjava.model.User user) {
    LOG.info(("create " + user));
    return service.save(user);
}