@java.lang.Override
public void edit(ru.javawebinar.topjava.model.Meal meal) {
    meals.remove(meal.getId());
    meals.put(meal.getId(), meal);
}