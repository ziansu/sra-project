public java.lang.String execute() {
    com.opensymphony.xwork2.ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_GA_USER);
    return SUCCESS;
}