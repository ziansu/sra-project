private boolean isValidInLength(android.text.Editable s) {
    return (!(respectPatternLength)) || ((s.length()) <= (maxLength));
}