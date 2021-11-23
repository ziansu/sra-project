public static controllers.Result redirect() {
    java.util.List<models.Meal> mealsEmpty = new java.util.ArrayList(0);
    return ok(searchAdvanced.render(" ", " ", models.Restaurant.all(), mealsEmpty, "", "", ""));
}