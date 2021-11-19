void cleanup(int event) throws java.lang.Exception {
    if (quit)
        return ;
    
    aQute.remote.agent.AgentServer.instances.remove(this);
    quit = true;
    update(null);
    redirect(0);
    sendEvent(event);
    link.close();
}