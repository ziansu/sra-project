private void setAppts(java.util.LinkedList<calendar.Appt> appts) {
    if (appts != null)
        this.appts = appts;
    
    if ((appts != null) && ((appts.size()) == 0))
        this.appts = appts;
    
}