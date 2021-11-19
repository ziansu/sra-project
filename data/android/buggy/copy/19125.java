public static void clear(javax.servlet.http.HttpSession session) {
    java.util.Map<java.lang.String, java.lang.Object> map = com.liferay.portal.kernel.servlet.SessionErrors._getMap(session, false);
    if (map != null) {
        map.clear();
    }
}