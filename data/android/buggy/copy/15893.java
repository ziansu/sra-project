public void updateList() {
    chooseClass.setItems(gradebookproject.GradebookProject.getClassSectionNamesObservable());
    chooseClass.setValue(gradebookproject.GradebookProject.getClassSectionNamesObservable().get(0));
}