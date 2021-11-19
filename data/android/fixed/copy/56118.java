private int get_Int_Day_From(int daysLater) {
    int dayOfWeek = daysLater + (today);
    dayOfWeek %= 7;
    if (dayOfWeek == 0) {
        dayOfWeek = 7;
    }
    return dayOfWeek;
}