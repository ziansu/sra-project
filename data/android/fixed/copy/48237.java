public void dispose() {
    java.util.Collection<org.eclipse.bpmn2.modeler.core.runtime.IRuntimeExtensionDescriptor> list = targetRuntime.getRuntimeExtensionDescriptors(getExtensionName());
    list.remove(this);
}