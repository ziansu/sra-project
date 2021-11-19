public boolean needsWeaving() {
    return (!(this.openAccessTasks.isEmpty())) || (!(this.openBindingTasks.isEmpty()));
}