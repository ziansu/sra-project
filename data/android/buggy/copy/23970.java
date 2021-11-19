@java.lang.Override
public synchronized void start() throws java.lang.Exception {
    freemarker.template.Template errorTemplate = getTemplate("templates/error.ftl");
    if (errorTemplate != null) {
        com.p4square.grow.frontend.ErrorPage.setTemplate(errorTemplate, com.p4square.fmfacade.FreeMarkerPageResource.baseRootObject(getContext()));
    }
    super.start();
}