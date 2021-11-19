@java.lang.Override
public void onReceiving() {
    if (!(hasPermission())) {
        Bar.BarClient.setRunning(false);
        java.lang.System.out.println("A bar client already exists!");
    }
}