private boolean isBackDated(java.util.Date startDate) {
    java.util.Date today = com.custodian.utils.StringDateUtils.getTodaysDate();
    return !((startDate != null) && (startDate.after(today)));
}