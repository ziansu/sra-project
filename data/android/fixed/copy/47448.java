@java.lang.Override
public java.util.List<b90ft4.web.repository.vo.WorkoutFoodNutritionFactVO> workoutFoodNutritionFactList(java.lang.String foodValue) throws java.lang.Exception {
    java.util.List<b90ft4.web.repository.vo.WorkoutFoodNutritionFactVO> list = wm.selectWorkoutFoodNutritionFactList(foodValue);
    return list;
}