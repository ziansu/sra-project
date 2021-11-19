public void setDueDate(java.util.Date dueDate) {
    if ((this.dueDate) == null) {
        this.dueDate = new java.util.GregorianCalendar();
    }
    this.dueDate.setTime(dueDate);
}