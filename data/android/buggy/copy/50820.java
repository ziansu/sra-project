private boolean isEmptyTextFieldInteger(java.lang.String textFieldInput) {
    if (textFieldInput.equals("")) {
        return !(isInteger(textFieldInput));
    }else {
        return false;
    }
}