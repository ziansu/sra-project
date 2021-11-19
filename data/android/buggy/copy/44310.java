public void configureColumns() {
    java.lang.System.out.println(("configureColumns no=" + (showNumber)));
    org.primefaces.context.RequestContext context = org.primefaces.context.RequestContext.getCurrentInstance();
    context.addCallbackParam("success", true);
}