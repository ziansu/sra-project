public java.lang.String checkCardNumberFormat(java.lang.String cardNumber) {
    if ((getCardNumberFormat()) == 1) {
        cardNumber = "**** **** **** " + (cardNumber.substring(((cardNumber.length()) - 4), 19));
    }
    return cardNumber;
}