public void run() {
    projectName.setText(updatedProject.getName());
    projectDescription.setText(updatedProject.getDescription());
    projectLastModifiedAt.setText(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(updatedProject.getLastModifiedAt()));
}