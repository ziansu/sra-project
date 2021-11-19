private void copyToTaskDateTimeList(java.time.LocalDateTime startDateTime, java.time.LocalDateTime endDateTime) {
    logic.add.LocalDateTimePair pair = new logic.add.LocalDateTimePair(startDateTime, endDateTime);
    if (task.getTaskDateTimes().isEmpty()) {
        task.addToTaskDateTimes(pair);
    }
}