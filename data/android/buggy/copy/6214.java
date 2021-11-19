public ru.javawebinar.topjava.model.Meal getMeal(int id) {
    return ru.javawebinar.topjava.DAO.MealDao.mealInMemory.get(id);
}