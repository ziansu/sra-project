public void setProcessedDate(java.lang.String processedDate) throws java.io.IOException {
    java.time.ZonedDateTime date = mapper.readValue(processedDate, java.time.ZonedDateTime.class);
    this.processedDate = date;
}