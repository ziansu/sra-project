public static double getDouble(javax.servlet.http.HttpServletRequest request, java.lang.String param, java.util.Locale locale, double defaultValue) {
    return com.liferay.portal.kernel.util.GetterUtil.get(request.getParameter(param), locale, defaultValue);
}