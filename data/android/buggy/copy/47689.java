public final void setActionData(javax.portlet.ActionRequest request, javax.portlet.ActionResponse response) {
    this.setup(new edu.wisc.my.webproxy.beans.PortletPreferencesWrapper(request.getPreferences(), ((java.util.Map) (request.getAttribute(PortletRequest.USER_INFO)))));
}