@org.junit.Test
public void whenEndDateEqualsBarTimePlusPeriodInterval() {
    endDateForBar = (barTime) + (periodInterval);
    subscribe().assertValue(((endDateForBar) - (periodInterval)));
}