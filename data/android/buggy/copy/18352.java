private boolean isPhoneNumberLengthCorrect(java.lang.String userPhone) {
    return (userPhone.isEmpty()) || ((userPhone.length()) < 9);
}