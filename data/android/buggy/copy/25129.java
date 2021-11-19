@java.lang.Override
public void receiveOutput(java.lang.String key, int value) throws java.rmi.RemoteException {
    this.wordCountMap.put(key, value);
    this.writeWordCountToFile();
}