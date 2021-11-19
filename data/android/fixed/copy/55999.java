public java.lang.String getActionUrl(final com.dotcms.contenttype.model.type.ContentType contentType, final com.liferay.portal.model.User user) {
    final javax.servlet.http.HttpServletRequest request = httpServletRequestThreadLocal.getRequest();
    return request != null ? getActionUrl(request, contentType, user) : null;
}