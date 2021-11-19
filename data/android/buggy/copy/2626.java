public void setEndDate(net.sf.memoranda.date.CalendarDate date) {
    if (date == null)
        setAttr("endDate", "");
    
    setAttr("endDate", date.toString());
}