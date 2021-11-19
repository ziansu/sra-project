public int getPending() {
    if (agentOptions.getEnabled()) {
        return 0;
    }else {
        return connection.messages.size();
    }
}