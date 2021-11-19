@java.lang.Override
@com.liferay.portal.kernel.spring.aop.Skip
public void clearCache() {
    com.liferay.portal.servlet.ComboServlet.clearCache();
    com.liferay.portal.service.impl.PortletLocalServiceImpl._portletIdsByStrutsPath.clear();
    portletLocalService.clearPortletsMap();
}