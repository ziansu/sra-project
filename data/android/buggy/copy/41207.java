protected static void createNewLesson() {
    java.lang.String validTitle = gui.LessonOverview.getValidTitle();
    if (!(validTitle.equals("-1"))) {
        new gui.EditLessonDialog(new util.Lesson(validTitle));
    }
}