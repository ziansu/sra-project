public static void removeSenderState(org.apache.catalina.tribes.Member member) {
    org.apache.catalina.tribes.transport.SenderState.memberStates.remove(member);
}