public void previousYearButtonHandler(javafx.event.ActionEvent ae) {
    int n = (java.lang.Integer.parseInt(calendarYearLabel.getText())) - 1;
    calendarYearLabel.setText(java.lang.String.valueOf(n));
    calendarGrid.fillCalendarWith(currentChosenMonthNumber, currentChosenYearNumber);
}