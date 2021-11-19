public java.lang.String stringCurrencyType() {
    switch (currencyType) {
        case 0 :
            return "DOLLAR";
        case 1 :
            return "EURO";
        case 2 :
            return "YEN";
        default :
            return "Not set";
    }
}