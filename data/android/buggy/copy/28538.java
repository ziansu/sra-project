@java.lang.Deprecated
public void editADJobConfiguration(java.lang.String applicationId, java.lang.String version, java.lang.String updateState, int pollingPeriod, java.lang.String tenantDomain) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    connector.editJob(getJobName(applicationId, version, ""), updateState, pollingPeriod, tenantDomain);
}