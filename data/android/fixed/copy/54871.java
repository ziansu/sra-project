@java.lang.Override
public boolean canAccess(org.xcolab.portlets.proposals.permissions.ProposalsPermissions permissions, org.xcolab.portlets.proposals.utils.context.ProposalsContext context, javax.portlet.PortletRequest request) {
    return ConfigurationAttributeKey.PUBLISH_JUDGING_RESULTS.get();
}