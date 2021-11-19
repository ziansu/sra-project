@java.lang.Override
public ru.javawebinar.topjava.model.Meal getById(int id) {
    for (java.lang.Integer i : meals.keySet())
        if (i == id) {
            return meals.get(i);
        }
    
    return null;
}