public void setFreeDay(java.lang.String freeDay) {
    if ((freeDay == null) || (!(schedule.Timetable.isDay(freeDay)))) {
        throw new java.lang.IllegalArgumentException();
    }
    this.freeDay = freeDay;
}