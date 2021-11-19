@java.lang.Override
public void run() {
    if (isTrader())
        try {
            resign();
        } catch (java.rmi.RemoteException e) {
            java.lang.System.out.println(e.toString());
        }
    
}