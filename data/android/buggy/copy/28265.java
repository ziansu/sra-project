@org.springframework.context.annotation.Bean(value = "findDiscoveredNodesTask")
private com.dell.cpsd.paqx.dne.domain.WorkflowTask findDiscoveredNodesTask() {
    return createTask("findDiscoveredNodesTaskHandler", new com.dell.cpsd.paqx.dne.service.task.handler.addnode.FindDiscoveredNodesTaskHandler(nodeService));
}