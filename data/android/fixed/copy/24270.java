@java.lang.Override
public void run() {
    org.activiti.bpmn.model.ServiceTask serviceTask = ((org.activiti.bpmn.model.ServiceTask) (bo));
    serviceTask.setImplementationType(type);
    serviceTask.setImplementation(value);
}