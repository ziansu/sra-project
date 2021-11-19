private java.util.ArrayList<logic.Task> sortList() {
    java.util.Collections.sort(masterListTasks);
    for (logic.Task debugEach : masterListTasks) {
        java.lang.System.out.println(debugEach.get_startDate());
    }
    return masterListTasks;
}