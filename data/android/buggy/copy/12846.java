private void setGradebookManager() {
    currentGradebook.setGradebookManager(currentCourseID);
    currentGradebook.setGradebookColumn(currentXML.getContent(SavedContent.Content.GRADECHOICE));
}