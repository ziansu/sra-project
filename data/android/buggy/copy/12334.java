public void deleteFiles() throws java.lang.Exception {
    java.lang.String filesToBeDeleted = getParameter("DELETE_FILES");
    deleteFiles(filesToBeDeleted.split(";"));
}