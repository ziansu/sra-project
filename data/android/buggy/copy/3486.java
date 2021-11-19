public java.util.Date next() {
    if (dayOfWeekField.isSkipWeek()) {
        return getNextRunTimeWithJumpWeekLimit();
    }else {
        return getNext();
    }
}