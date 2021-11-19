public int leapYear(int year) {
    int out;
    if ((year % 4) == 0) {
        out = 29;
    }else {
        out = 28;
    }
    return out;
}