public static org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache getInstance() {
    if ((org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance) == null) {
        synchronized(org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.class) {
            if ((org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance) == null) {
                org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance = new org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache();
            }
        }
    }
    return org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance;
}