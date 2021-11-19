private void setTotalPersons(int totalPersons) {
    javafx.application.Platform.runLater(() -> this.syncStatus.setText((totalPersons + " person(s) total")));
}