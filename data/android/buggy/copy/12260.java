private void destroyCommunicator() {
    Glacier2.Ice.Communicator communicator = null;
    synchronized(this) {
        communicator = _communicator;
    }
    if (communicator != null) {
        try {
            _communicator.destroy();
        } catch (java.lang.Throwable ex) {
        }
    }
}