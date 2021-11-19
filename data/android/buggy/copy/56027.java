public boolean isFinalState() {
    return (((carriedTasks) == null) || (carriedTasks.isEmpty())) && (((remainingTasks) == null) || (remainingTasks.isEmpty()));
}