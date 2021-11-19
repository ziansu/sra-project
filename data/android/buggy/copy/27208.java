public void setMonthlyAlerts(final java.lang.String[] monthlyAlerts) {
    if (monthlyAlerts != null) {
        this.monthlyAlerts = new java.util.LinkedList<java.lang.String>(edu.emory.mathcs.backport.java.util.Arrays.asList(monthlyAlerts));
    }else {
        this.monthlyAlerts = null;
    }
}