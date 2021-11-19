@java.lang.Override
public void onDisable() {
    net.izenith.Main.Util.setAllOnlineTimes();
    try {
        Vars.remoteConsoleSocket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}