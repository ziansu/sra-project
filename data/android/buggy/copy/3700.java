public java.util.Date getLegacyDateValue() {
    return java.util.Date.from(internalDate.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
}