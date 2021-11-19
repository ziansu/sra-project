@java.lang.Override
public void onReceiving() {
    if (!(hasPermission())) {
        java.lang.System.out.println("A bar client already exists!");
    }
}