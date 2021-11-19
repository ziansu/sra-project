public java.lang.String getExercises(java.lang.String workout) {
    java.lang.String sql = ("SELECT name FROM exerciseinworkout WHERE workoutid = \"" + workout) + "\"";
    return sql;
}