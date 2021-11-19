@java.lang.Override
public org.apache.struts.action.ActionForward save(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    updateSuspensionCategoriesOnDocument(form);
    return super.save(mapping, form, request, response);
}