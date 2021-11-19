public boolean isActive() {
    org.joda.time.LocalDate now = org.joda.time.LocalDate.now();
    return (!(now.isBefore(start))) && (!(end.isBefore(now)));
}