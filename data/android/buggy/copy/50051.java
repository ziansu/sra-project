public static java.util.List<models.Meal> all(int id) {
    return models.Meal.find.where().eq("id", id).findList();
}