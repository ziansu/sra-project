private java.time.LocalDate adjustStartDate(final java.time.LocalDate date) {
    java.time.LocalDate nextWorkingDate = date;
    while (!(isWorkingDay(nextWorkingDate))) {
        nextWorkingDate = date.plusDays(1);
    } 
    return nextWorkingDate;
}