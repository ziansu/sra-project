@java.lang.Override
public java.util.List<b90ft4.web.repository.vo.WorkoutFoodNutritionFactVO> workoutFoodNutritionFactList(java.lang.String foodValue) throws java.lang.Exception {
    java.lang.System.out.println("imp까지 옴");
    java.util.List<b90ft4.web.repository.vo.WorkoutFoodNutritionFactVO> list = wm.selectWorkoutFoodNutritionFactList(foodValue);
    java.lang.System.out.println("imp리턴받음");
    return list;
}