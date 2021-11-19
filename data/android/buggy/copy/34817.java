@java.lang.SuppressWarnings(value = "unused")
protected void deactivate(org.osgi.service.component.ComponentContext componentContext) {
    try {
        org.wso2.carbon.device.mgt.core.task.DeviceTaskManagerService taskManagerService = new org.wso2.carbon.device.mgt.core.task.impl.DeviceTaskManagerServiceImpl();
        taskManagerService.stopTask();
    } catch (java.lang.Throwable e) {
        org.wso2.carbon.device.mgt.core.internal.DeviceTaskManagerServiceComponent.log.error("Error occurred while destroying the device details retrieving task manager service.", e);
    }
}