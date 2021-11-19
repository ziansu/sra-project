public void updateStartAndEndDateTimes() {
    this.startDateTime = taskDateTimes.get(0).getStartDateTime();
    this.endDateTime = taskDateTimes.get(((taskDateTimes.size()) - 1)).getEndDateTime();
}