private java.lang.String getFileDirectory(java.lang.String fileDir) {
    if (fileDir.equals(org.jimple.planner.Constants.PROPERTIES_SAVEPATH_TO_CWD)) {
        fileDir = org.jimple.planner.Constants.EMPTY_STRING;
    }
    return fileDir;
}