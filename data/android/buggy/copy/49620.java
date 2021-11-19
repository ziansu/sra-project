private boolean isStartCorrect(java.time.LocalDateTime start) {
    java.time.LocalDateTime temp = java.time.LocalDateTime.parse("0000-01-01T03:00:01");
    if ((start.equals(temp)) || (start == null)) {
        return false;
    }else {
        return true;
    }
}