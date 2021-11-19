public void setDeleteAlerts(java.lang.String[] deleteAlerts) {
    if (deleteAlerts != null) {
        this.deleteAlerts = new java.util.LinkedList<java.lang.String>(edu.emory.mathcs.backport.java.util.Arrays.asList(deleteAlerts));
    }else {
        this.deleteAlerts = null;
    }
}