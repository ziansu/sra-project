public retrofit2.Call<java.util.List<kis.agh.edu.pl.childrensupervisiorandroid.database.Task>> getTasksCall() {
    retrofit2.Call<java.util.List<kis.agh.edu.pl.childrensupervisiorandroid.database.Task>> tasksCall = service.getTasks(parentName, childName);
    java.util.List<kis.agh.edu.pl.childrensupervisiorandroid.database.Task> tasks = null;
    return tasksCall;
}