private void unregisterInterest(java.lang.Object caller, org.ccnx.ccn.protocol.Interest interest, java.lang.Object handler) {
    org.ccnx.ccn.impl.CCNNetworkManager.InterestRegistration reg = new org.ccnx.ccn.impl.CCNNetworkManager.InterestRegistration(interest, handler, caller);
    unregisterInterest(reg);
}