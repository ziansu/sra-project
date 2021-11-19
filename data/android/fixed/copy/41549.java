@org.apache.struts2.interceptor.validation.SkipValidation
@org.apache.struts2.convention.annotation.Action(value = "/masters/scheme-newForm")
public java.lang.String newForm() {
    if (org.egov.web.actions.masters.SchemeAction.LOGGER.isDebugEnabled())
        org.egov.web.actions.masters.SchemeAction.LOGGER.debug("..Inside NewForm method..");
    
    mode = NEW;
    return NEW;
}