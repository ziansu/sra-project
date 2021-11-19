protected lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean isAuthenticationLocked() throws java.rmi.NotBoundException, java.rmi.RemoteException {
    return new lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean(((loginCounter.getValue()) >= 8));
}