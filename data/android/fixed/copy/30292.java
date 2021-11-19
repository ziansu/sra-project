public static boolean isError(com.emc.storageos.model.TaskResourceRep task) {
    return ((task == null) || ((task.getState()) == null)) || (com.emc.vipr.client.core.impl.TaskUtil.State.error.name().equalsIgnoreCase(task.getState()));
}