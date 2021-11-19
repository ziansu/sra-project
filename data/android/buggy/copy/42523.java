private boolean isAgentRunning(com.navercorp.pinpoint.web.applicationmap.AgentInfo agentInfo) {
    return (agentInfo.getStatus().getState()) == (com.navercorp.pinpoint.common.util.AgentLifeCycleState.RUNNING);
}