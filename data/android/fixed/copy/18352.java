private boolean isPhoneNumberLengthCorrect(java.lang.String userPhone) {
    return ((userPhone != null) && (!(userPhone.isEmpty()))) && ((userPhone.length()) >= 9);
}