private void sendFailForAll() {
    for (int id = 0; id < (Simulation.NumberOfAgents); id++) {
        if ((this.id) != id) {
            sendMessage(new Messages.KillMessage(), id);
        }
    }
}