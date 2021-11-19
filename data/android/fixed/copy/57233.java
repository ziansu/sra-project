public void setDateObject(java.lang.String input, java.time.format.DateTimeFormatter dateFormatter) {
    if (((dateObject) == (java.time.LocalDate.MAX)) && (!(input.isEmpty()))) {
        dateObject = java.time.LocalDate.parse(input, dateFormatter);
    }
}