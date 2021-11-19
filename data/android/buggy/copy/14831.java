public boolean canPreconditionSucceed(edu.wpi.cetask.Plan eventPlan) {
    return (collaboration.getPreconditionValue(eventPlan.getType().getPrecondition())) != null ? true : false;
}