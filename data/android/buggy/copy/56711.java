@java.lang.Override
public java.util.List<java.lang.Integer> retrieveQueuingTimeHistory(int id, int nthDayToReview) {
    java.util.Calendar historicalDay = java.util.Calendar.getInstance();
    historicalDay.setTime(date.getTime());
    return flowGenerator.historyQueuingTime(id, date, nthDayToReview);
}