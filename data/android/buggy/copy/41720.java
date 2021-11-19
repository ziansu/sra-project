public void saveTasks(java.util.ArrayList<tasknote.shared.TaskObject> overrideTasks) throws java.io.IOException, tasknote.shared.TaskListIOException {
    cleanFile();
    fileManipulator.writeTasks(overrideTasks);
}