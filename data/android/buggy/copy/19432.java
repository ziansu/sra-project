@java.lang.Override
public org.wso2.carbon.appfactory.core.dto.Statistic[] getApplicationStatistics(java.lang.String applicationId, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String tenantDomain) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    java.util.List<java.lang.String> jobsNames = connector.getJobNames(applicationId, tenantDomain);
    return getBuildStatistics(jobsNames, tenantDomain);
}