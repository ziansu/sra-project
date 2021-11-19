private void copyToTaskDateTimeList(java.time.LocalDateTime startDateTime, java.time.LocalDateTime endDateTime) {
    logic.add.LocalDateTimePair pair = new logic.add.LocalDateTimePair(startDateTime, endDateTime);
    task.addToTaskDateTimes(pair);
}