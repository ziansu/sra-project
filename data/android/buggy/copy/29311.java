private boolean isStartCorrect(java.time.LocalDateTime start) {
    java.lang.String start1 = start.toString();
    if (start1.equals("0000-01-01T03:00:01")) {
        return false;
    }else {
        return true;
    }
}