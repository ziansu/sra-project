public void setStatus(int status) {
    if (status == (uk.ac.aber.cs221.group15.task.Task.ABANDONED)) {
        throw new java.lang.IllegalArgumentException("Not allowed to set status as ABANDONED!");
    }
    this.status.set(status);
}