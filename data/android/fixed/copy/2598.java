public double answerForQ5() {
    android.widget.RadioButton radioButton = ((android.widget.RadioButton) (findViewById(R.id.five_radio_button)));
    if (radioButton.isSelected()) {
        overallScore = (overallScore) + 1;
    }
    return overallScore;
}