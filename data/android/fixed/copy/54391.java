private void sortList() {
    java.util.Collections.sort(logic.Execution.mainList);
    int id = 1;
    for (logic.Task task : logic.Execution.mainList) {
        task.setId(id);
        id++;
    }
}