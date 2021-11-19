public void stopPropose() {
    phase = PaxosConstants.PAXOS_PHASE_NONE;
    paxosProposeCtx.reset();
    curReqIsn = 0;
    curLeaderInfo = null;
    if ((proposalTimer) != null) {
        proposalTimer.cancel();
        proposalTimer = null;
    }
}