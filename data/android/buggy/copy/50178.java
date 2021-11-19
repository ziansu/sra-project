public void setEndDate(net.sf.memoranda.date.CalendarDate d) {
    if (d != null)
        this.endDate.getModel().setValue(d.getDate());
    
}