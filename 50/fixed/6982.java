public java.lang.Boolean getHasWeekend() {
    if ((getValidWeekdays().contains(Weekday.SATURDAY)) || (getValidWeekdays().contains(Weekday.SUNDAY))) {
        return true;
    }
    return false;
}