public java.util.List<com.degwee.model.Muscle> getAllMuscles() {
    allMuscles = muscleService.findAllMuscles();
    return allMuscles;
}