public void setValue(com.cpq.workout.model.ActionEvent actionEvent) {
    this.actionEvent = actionEvent;
    this.value = actionEvent.getRecord();
    updateView();
}