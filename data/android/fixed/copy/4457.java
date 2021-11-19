@java.lang.Override
protected org.springframework.web.servlet.view.freemarker.FreeMarkerConfig autodetectConfiguration() throws org.springframework.beans.BeansException {
    org.craftercms.engine.service.context.SiteContext context = org.craftercms.engine.service.context.SiteContext.getCurrent();
    if (context != null) {
        return context.getFreeMarkerConfig();
    }else {
        return super.autodetectConfiguration();
    }
}