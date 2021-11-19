public java.lang.String all() {
    java.lang.String msg = "lh,klm " + (com.airhacks.FlightsSchedulerService.COUNTER.intValue());
    events.fire(msg);
    sc.setRollbackOnly();
    return msg;
}