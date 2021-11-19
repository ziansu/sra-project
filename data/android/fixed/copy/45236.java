public java.util.Date getSnoozePeriod() {
    if ((cta.getSnoozeperiod()) != null) {
        return cta.getSnoozeperiod().toDate();
    }else {
        return null;
    }
}