private boolean isPhaseContestHasNoValidContest(com.ext.portlet.model.ContestPhase phase) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    try {
        com.ext.portlet.service.ContestPhaseLocalServiceUtil.getContest(phase);
    } catch (com.ext.portlet.NoSuchContestException e) {
        com.ext.portlet.service.impl.ContestPhaseLocalServiceImpl._log.warn("promoting phase failed due to invalid contest ", e);
        return false;
    }
    return true;
}