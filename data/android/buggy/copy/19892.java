public void onAddStepsButtonPress() {
    isAddStepsValid(addSteps.getText());
    addDailySteps(addSteps.getText());
    addLeftSteps(dailySteps.getText());
}