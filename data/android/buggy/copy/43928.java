public void setPlayerAgent(prog.core.PlayerAgent playerAgent) {
    if ((agent) != null) {
        agent.dismiss();
    }
    agent = playerAgent;
}