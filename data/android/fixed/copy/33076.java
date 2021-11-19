public static boolean isNotifyOutboundSecurityFailureImmediate() {
    java.lang.String notifySecurityFailure = gov.hhs.fha.nhinc.direct.messagemonitoring.util.MessageMonitoringUtil.getPropertyStringValue("NotifyOutboundSecurityFailureImmediate");
    gov.hhs.fha.nhinc.direct.messagemonitoring.util.MessageMonitoringUtil.LOG.info(("isNotifyOutboundSecurityFailureImmediate() " + notifySecurityFailure));
    if (notifySecurityFailure == null) {
        return gov.hhs.fha.nhinc.direct.messagemonitoring.util.MessageMonitoringUtil.DEFAULT_NOTIFIY_OUTBOUND_SECURITY_FAILURE_IMMEDIATE;
    }
    return "true".equals(notifySecurityFailure);
}