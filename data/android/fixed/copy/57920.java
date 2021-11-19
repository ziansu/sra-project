public java.util.List<com.edd.food.pojo.Food> getFoods() {
    com.edd.food.jdbc.FoodJDBCDriver foodJdbc = new com.edd.food.jdbc.FoodJDBCDriver();
    this.foods = foodJdbc.getFoods();
    return foods;
}