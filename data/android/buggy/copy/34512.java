public void setStartDate(java.time.LocalDate startDate) throws taskie.exceptions.TaskDateInvalidException {
    if (((_endDate) == null) || (_endDate.isAfter(startDate))) {
        throw new taskie.exceptions.TaskDateInvalidException("startDate is after endDate");
    }else {
        this._startDate = startDate;
    }
}