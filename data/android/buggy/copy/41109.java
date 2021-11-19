@java.lang.Override
public boolean resourceExists(java.lang.String name) {
    if (org.giiwa.framework.web.TemplateLoader.log.isDebugEnabled())
        org.giiwa.framework.web.TemplateLoader.log.debug(("exists? name=" + name));
    
    java.io.File f = getFile(name);
    return f != null;
}