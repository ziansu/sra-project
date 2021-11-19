@java.lang.SuppressWarnings(value = "rawtypes")
public hudson.model.Descriptor getDescriptorOrDie(java.lang.Class<? extends hudson.model.Describable> type) {
    return jenkins.model.Jenkins.getInstance().getDescriptorOrDie(type);
}