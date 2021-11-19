@java.lang.Override
public java.lang.String execute() throws java.lang.Exception {
    state = service.getPaperState(uid, pid);
    if ((state) > 0)
        return SUCCESS;
    
    return ERROR;
}