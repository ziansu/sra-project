public java.util.ArrayList<java.lang.String> run() {
    setEditInformation();
    checkEditInformation();
    getTaskIdOfTaskToBeEdited();
    editTask();
    updateCategory();
    saveExternal();
    updateGuiDisplay();
    setOutput();
    return output;
}