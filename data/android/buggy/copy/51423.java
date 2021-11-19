private java.lang.String convertHourToWord(int src) {
    boolean isAM = src <= 11;
    if (src == 0) {
        return "twelve";
    }else {
        return hourWords[(src % 12)];
    }
}