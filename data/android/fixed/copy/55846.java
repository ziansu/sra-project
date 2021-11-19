void updateSubmitButton(boolean working) {
    submit.setHighlighted((!working));
    submit.setEnabled(working);
}