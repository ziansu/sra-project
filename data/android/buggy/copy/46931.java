private java.lang.String getCounterFullName(java.lang.String group, java.lang.String counter) {
    java.lang.String counterName = java.lang.String.format("%s::%s", group, counter);
    return counterName;
}