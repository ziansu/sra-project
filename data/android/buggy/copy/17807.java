private void advanceToBusinessOpenIfNeeded() {
    if (currentSlotEnd().toLocalTime().isBefore(businessOpen)) {
        cursor = java.time.LocalDateTime.of(cursor.toLocalDate(), businessOpen);
    }
}