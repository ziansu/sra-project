public void writeSaveFile(java.util.ArrayList<cs2103_w09_1j.esther.Task> tasks) throws java.io.IOException {
    assert tasks != null;
    tasksBuffer = tasks;
    validifyTasksBuffer();
    writeFile(tasksToString(tasksBuffer), savePath);
}