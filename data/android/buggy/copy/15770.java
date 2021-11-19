public ru.javawebinar.topjava.model.Meal save(ru.javawebinar.topjava.model.Meal meal) {
    ru.javawebinar.topjava.web.meal.MealRestController.LOG.info(("save " + meal));
    meal.setId(ru.javawebinar.topjava.AuthorizedUser.getId());
    return service.save(meal);
}