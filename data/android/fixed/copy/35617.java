public static java.lang.String getNumberString(int number) {
    if ((number >= 0) && (number <= 9)) {
        return "0" + number;
    }else {
        return "" + number;
    }
}