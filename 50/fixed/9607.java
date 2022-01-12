private void openProject(java.io.File file) {
    injector.getInstance(de.prob2.ui.project.ProjectManager.class).openProject(file);
    javafx.application.Platform.runLater(() -> injector.getInstance(de.prob2.ui.verifications.modelchecking.ModelcheckingController.class).resetView());
}