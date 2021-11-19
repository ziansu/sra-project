private void initializeLogicSystemVariables() throws java.io.IOException, java.text.ParseException {
    _tasks = _storage.readSaveFile();
    _undoStack = new java.util.Stack<cs2103_w09_1j.esther.State>();
    updateInternalStorage();
}