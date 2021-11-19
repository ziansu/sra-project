public java.lang.String execute() throws java.lang.Exception {
    events = eventManager.listEvents();
    return SUCCESS;
}