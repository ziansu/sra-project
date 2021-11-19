@java.lang.Override
public java.util.Map<hudson.triggers.TriggerDescriptor, hudson.triggers.Trigger<?>> getTriggers() {
    org.jenkinsci.plugins.workflow.job.properties.PipelineTriggersJobProperty triggerProp = getTriggersJobProperty();
    if (triggerProp != null) {
        return triggerProp.getTriggersMap();
    }else {
        return new java.util.HashMap<>();
    }
}