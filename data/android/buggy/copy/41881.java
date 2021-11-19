public static java.time.LocalDateTime floorDate(java.time.LocalDateTime dateTime) {
    return dateTime.toLocalDate().atTime(0, 0);
}