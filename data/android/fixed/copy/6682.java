public java.lang.String getFormattedStartDate() {
    assert _isStartDateSet;
    return defaultPart.Task.dateFormat.format(_startDateAndTime.getTime());
}