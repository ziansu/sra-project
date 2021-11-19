void numberPressed(int number) {
    runningNumber += java.lang.String.valueOf(number);
    resultView.setText(runningNumber);
}