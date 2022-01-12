private void clearForm() {
    amountEditText.setText("");
    commentEditText.setText("");
    selectedDate = java.util.Calendar.getInstance();
    setInitialDate(selectedDate);
}