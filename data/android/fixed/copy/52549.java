@java.lang.Override
public void performAction(org.parosproxy.paros.model.SiteNode sn) {
    try {
        uiManager.handleAddBreakpoint(new org.zaproxy.zap.model.StructuralSiteNode(sn).getRegexPattern(false));
    } catch (org.parosproxy.paros.db.DatabaseException e) {
    }
}