public static void setToDefault() throws java.io.FileNotFoundException {
    app.AppModel._isFirstTime = true;
    app.AppModel._levelsUnlocked = 0;
    app.AppModel._voice = "default";
    app.AppModel._currentSreak = 0;
    app.AppModel._spellingListPath = app.AppModel.DEFAULT_SPELLING_LIST;
    app.AppModel.updateTxtFile();
}