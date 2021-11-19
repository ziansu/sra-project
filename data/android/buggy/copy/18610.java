private void prepareMockDBData() {
    mealRepository.deleteAll();
    for (com.indiankitchen.data.MealDTO mealDTO : com.indiankitchen.data.utility.MealService.allMealsStartupData) {
        mealRepository.save(new com.indiankitchen.data.MealEntity(mealDTO));
    }
}