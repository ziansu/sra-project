public static play.mvc.Result deleteMeal() {
    java.lang.String MealID = controllers.RestaurantController.inputForm.bindFromRequest().get().MealID;
    if ((controllers.Meal.deleteMeal(MealID)) == true) {
        return TODO;
    }
    return TODO;
}