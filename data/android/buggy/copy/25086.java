public static java.lang.Object get(javax.portlet.PortletRequest portletRequest, java.lang.Class<?> clazz) {
    return com.liferay.portal.kernel.servlet.SessionErrors.get(portletRequest.getPortletSession(false), clazz.getName());
}