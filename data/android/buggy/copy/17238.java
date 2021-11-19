@java.lang.SuppressWarnings(value = "rawtypes")
public <T extends hudson.model.Descriptor> T getDescriptorByType(java.lang.Class<T> type) {
    return jenkins.model.Jenkins.getInstance().getDescriptorByType(type);
}