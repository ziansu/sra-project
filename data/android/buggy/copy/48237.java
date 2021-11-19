public void dispose() {
    java.util.List<org.eclipse.bpmn2.modeler.core.runtime.IRuntimeExtensionDescriptor> list = targetRuntime.getRuntimeExtensionDescriptors(getExtensionName());
    list.remove(this);
}