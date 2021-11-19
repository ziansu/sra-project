private void setTotalPersons(int totalPersons) {
    javafx.application.Platform.runLater(() -> this.totalPersons.setText((totalPersons + " person(s) total")));
}