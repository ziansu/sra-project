public void setDateOfBirth(java.lang.String dateOfBirth) {
    try {
        this.dateOfBirth = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}