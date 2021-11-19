private boolean hasAmOrPm(java.lang.String keyword) {
    return (((keyword.contains("am")) || (keyword.contains("AM"))) || (keyword.contains("pm"))) || (keyword.contains("PM"));
}